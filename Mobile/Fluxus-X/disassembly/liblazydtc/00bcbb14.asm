; FUN_00bcbb14 @ 00bcbb14
00bcbb14	paciasp
00bcbb18	stp x29,x30,[sp, #-0x30]!
00bcbb1c	stp x22,x21,[sp, #0x10]
00bcbb20	stp x20,x19,[sp, #0x20]
00bcbb24	mov x29,sp
00bcbb28	mov x22,x0
00bcbb2c	mov w0,#0x20
00bcbb30	mov x20,x2
00bcbb34	mov x21,x1
00bcbb38	bl 0x00c30000
00bcbb3c	mov x19,x0
00bcbb40	mov x1,x22
00bcbb44	mov x2,x21
00bcbb48	mov x3,x20
00bcbb4c	bl 0x00c43e30
00bcbb50	adrp x1,0xcb5000
00bcbb54	adrp x2,0xcb5000
00bcbb58	mov x0,x19
00bcbb5c	ldr x1,[x1, #0xb28]
00bcbb60	ldr x2,[x2, #0xb20]
00bcbb64	bl 0x00c30020
