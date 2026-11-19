; sha512_224_init @ 00ae130c
00ae130c	adrp x9,0x29c000
00ae1310	ldr q0,[x9, #0xd90]
00ae1314	adrp x9,0x29c000
00ae1318	ldr q1,[x9, #0x5d0]
00ae131c	adrp x9,0x29c000
00ae1320	ldr q2,[x9, #0x660]
00ae1324	adrp x9,0x29c000
00ae1328	stp q0,q1,[x0]
00ae132c	ldr q0,[x9, #0x380]
00ae1330	orr x9,xzr,#0x1c00000000
00ae1334	mov x8,x0
00ae1338	str x9,[x0, #0xd0]
00ae133c	mov w0,#0x1
00ae1340	stp q2,q0,[x8, #0x20]
00ae1344	stp xzr,xzr,[x8, #0x40]
00ae1348	ret
