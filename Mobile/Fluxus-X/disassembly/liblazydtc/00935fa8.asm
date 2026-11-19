; FUN_00935fa8 @ 00935fa8
00935fa8	ldr x8,[x0, #0x138]
00935fac	mov x2,x1
00935fb0	cbz x8,0x00935fc8
00935fb4	ldr w9,[x8, #0x18]
00935fb8	cmp w9,#0x4
00935fbc	b.eq 0x00935fd0
00935fc0	ldr x8,[x8, #0x8]
00935fc4	cbnz x8,0x00935fb4
00935fc8	mov w0,#0x1a
00935fcc	ret
00935fd0	ldr x9,[x8]
00935fd4	mov x1,x8
00935fd8	ldr x3,[x9, #0x30]
00935fdc	br x3
