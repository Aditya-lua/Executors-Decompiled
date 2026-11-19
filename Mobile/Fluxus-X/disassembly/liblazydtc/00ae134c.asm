; sha512_256_init @ 00ae134c
00ae134c	adrp x9,0x29c000
00ae1350	ldr q0,[x9, #0x9b0]
00ae1354	adrp x9,0x29d000
00ae1358	ldr q1,[x9, #0x240]
00ae135c	adrp x9,0x29c000
00ae1360	ldr q2,[x9, #0x300]
00ae1364	adrp x9,0x29d000
00ae1368	stp q0,q1,[x0]
00ae136c	ldr q0,[x9, #0x120]
00ae1370	orr x9,xzr,#0x2000000000
00ae1374	mov x8,x0
00ae1378	str x9,[x0, #0xd0]
00ae137c	mov w0,#0x1
00ae1380	stp q2,q0,[x8, #0x20]
00ae1384	stp xzr,xzr,[x8, #0x40]
00ae1388	ret
