; FUN_00844fa0 @ 00844fa0
00844fa0	stp x29,x30,[sp, #-0x20]!
00844fa4	stp x20,x19,[sp, #0x10]
00844fa8	mov x29,sp
00844fac	mov w0,#0x18
00844fb0	bl 0x00c30000
00844fb4	mov x19,x0
00844fb8	mov w1,#0xb
00844fbc	bl 0x00c30640
00844fc0	adrp x1,0xcb4000
00844fc4	adrp x2,0xcb4000
00844fc8	mov x0,x19
00844fcc	ldr x1,[x1, #0xa78]
00844fd0	ldr x2,[x2, #0xa80]
00844fd4	bl 0x00c30020
