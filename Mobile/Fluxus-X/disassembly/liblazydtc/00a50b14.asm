; ENGINE_set_default @ 00a50b14
00a50b14	stp x20,x19,[sp, #-0x20]!
00a50b18	mov w20,w1
00a50b1c	mov x19,x0
00a50b20	stp x29,x30,[sp, #0x10]
00a50b24	add x29,sp,#0x10
00a50b28	tbz w1,#0x6,0x00a50b38
00a50b2c	mov x0,x19
00a50b30	bl 0x00c3bad0
00a50b34	cbz w0,0x00a50bbc
00a50b38	tbz w20,#0x7,0x00a50b48
00a50b3c	mov x0,x19
00a50b40	bl 0x00c3bae0
00a50b44	cbz w0,0x00a50bbc
00a50b48	tbz w20,#0x0,0x00a50b58
00a50b4c	mov x0,x19
00a50b50	bl 0x00c3bac0
00a50b54	cbz w0,0x00a50bbc
00a50b58	tbz w20,#0x1,0x00a50b68
00a50b5c	mov x0,x19
00a50b60	bl 0x00c3ba90
00a50b64	cbz w0,0x00a50bbc
00a50b68	tbz w20,#0x2,0x00a50b78
00a50b6c	mov x0,x19
00a50b70	bl 0x00c3ba80
00a50b74	cbz w0,0x00a50bbc
00a50b78	tbz w20,#0xb,0x00a50b88
00a50b7c	mov x0,x19
00a50b80	bl 0x00c3baa0
00a50b84	cbz w0,0x00a50bbc
00a50b88	tbz w20,#0x3,0x00a50b98
00a50b8c	mov x0,x19
00a50b90	bl 0x00c3bab0
00a50b94	cbz w0,0x00a50bbc
00a50b98	tbz w20,#0x9,0x00a50ba8
00a50b9c	mov x0,x19
00a50ba0	bl 0x00c3bb00
00a50ba4	cbz w0,0x00a50bbc
00a50ba8	tbz w20,#0xa,0x00a50bb8
00a50bac	mov x0,x19
00a50bb0	bl 0x00c3baf0
00a50bb4	cbz w0,0x00a50bbc
00a50bb8	mov w0,#0x1
00a50bbc	ldp x29,x30,[sp, #0x10]
00a50bc0	ldp x20,x19,[sp], #0x20
00a50bc4	ret
