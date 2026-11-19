; FUN_00bcab04 @ 00bcab04
00bcab04	paciasp
00bcab08	stp x29,x30,[sp, #-0x20]!
00bcab0c	stp x20,x19,[sp, #0x10]
00bcab10	mov x29,sp
00bcab14	mov x20,x0
00bcab18	mov w0,#0x10
00bcab1c	bl 0x00c30000
00bcab20	mov x19,x0
00bcab24	mov x1,x20
00bcab28	bl 0x008de29c
00bcab2c	adrp x1,0xcb4000
00bcab30	adrp x2,0xcb4000
00bcab34	mov x0,x19
00bcab38	ldr x1,[x1, #0xc10]
00bcab3c	ldr x2,[x2, #0xc18]
00bcab40	bl 0x00c30020
