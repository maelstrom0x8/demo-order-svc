#!/bin/bash

COMMIT_MESSAGE=$1
VERSION=v$2


git add --all
git commit -m ${COMMIT_MESSAGE}
git tag ${VERSION}
git push origin ${VERSION}
