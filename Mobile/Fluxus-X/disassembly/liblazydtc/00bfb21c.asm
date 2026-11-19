; std::__ndk1::locale::locale @ 00bfb21c
00bfb21c	paciasp
00bfb220	stp x29,x30,[sp, #-0x30]!
00bfb224	stp x22,x21,[sp, #0x10]
00bfb228	stp x20,x19,[sp, #0x20]
00bfb22c	mov x29,sp
00bfb230	mov x20,x0
00bfb234	mov w0,#0x138
00bfb238	mov w21,w3
00bfb23c	mov x22,x2
00bfb240	mov x19,x1
00bfb244	bl 0x00c2fed0
00bfb248	ldr x1,[x19]
00bfb24c	mov x19,x0
00bfb250	mov x2,x22
00bfb254	mov w3,w21
00bfb258	bl 0x00bf7758
00bfb25c	add x1,x19,#0x8
00bfb260	mov w0,#0x1
00bfb264	str x19,[x20]
00bfb268	bl 0x00c2bce0
00bfb26c	ldp x20,x19,[sp, #0x20]
00bfb270	ldp x22,x21,[sp, #0x10]
00bfb274	ldp x29,x30,[sp], #0x30
00bfb278	autiasp
00bfb27c	ret
