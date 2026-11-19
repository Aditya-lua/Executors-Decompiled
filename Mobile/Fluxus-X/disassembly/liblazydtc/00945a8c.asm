; FUN_00945a8c @ 00945a8c
00945a8c	ldr x8,[x1, #0x12f0]
00945a90	cbz x8,0x00945a9c
00945a94	mov w0,#0x1
00945a98	ret
00945a9c	ldrh w8,[x0, #0x18]
00945aa0	ldrh w9,[x0, #0x1a]
00945aa4	and w8,w8,w9
00945aa8	ubfx w0,w8,#0x5,#0x1
00945aac	ret
