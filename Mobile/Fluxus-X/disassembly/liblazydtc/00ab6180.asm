; PEM_ASN1_write @ 00ab6180
00ab6180	sub sp,sp,#0x70
00ab6184	stp x28,x27,[sp, #0x10]
00ab6188	stp x26,x25,[sp, #0x20]
00ab618c	stp x24,x23,[sp, #0x30]
00ab6190	stp x22,x21,[sp, #0x40]
00ab6194	stp x20,x19,[sp, #0x50]
00ab6198	stp x29,x30,[sp, #0x60]
00ab619c	add x29,sp,#0x60
00ab61a0	mov x19,x7
00ab61a4	mov w20,w6
00ab61a8	mov x21,x5
00ab61ac	mov x22,x4
00ab61b0	mov x23,x3
00ab61b4	mov x27,x2
00ab61b8	mov x25,x1
00ab61bc	mov x26,x0
00ab61c0	bl 0x00c32270
00ab61c4	bl 0x00c32240
00ab61c8	cbz x0,0x00ab6220
00ab61cc	ldr x28,[x29, #0x10]
00ab61d0	mov w1,#0x6a
00ab61d4	mov x2,xzr
00ab61d8	mov x3,x27
00ab61dc	mov x24,x0
00ab61e0	bl 0x00c321a0
00ab61e4	mov x0,x26
00ab61e8	mov x1,x25
00ab61ec	mov x2,x24
00ab61f0	mov x3,x23
00ab61f4	mov x4,x22
00ab61f8	mov x5,x21
00ab61fc	mov w6,w20
00ab6200	mov x7,x19
00ab6204	str x28,[sp]
00ab6208	bl 0x00ab6274
00ab620c	mov w19,w0
00ab6210	mov x0,x24
00ab6214	bl 0x00c31a40
00ab6218	mov w0,w19
00ab621c	b 0x00ab6254
00ab6220	bl 0x00c342a0
00ab6224	adrp x0,0x2ce000
00ab6228	adrp x2,0x2dc000
00ab622c	add x0,x0,#0x16c
00ab6230	add x2,x2,#0x7fb
00ab6234	mov w1,#0x12e
00ab6238	bl 0x00c342b0
00ab623c	mov w1,#0x7
00ab6240	mov w0,#0x9
00ab6244	movk w1,#0x8, LSL #16
00ab6248	mov x2,xzr
00ab624c	bl 0x00c342c0
00ab6250	mov w0,wzr
00ab6254	ldp x29,x30,[sp, #0x60]
00ab6258	ldp x20,x19,[sp, #0x50]
00ab625c	ldp x22,x21,[sp, #0x40]
00ab6260	ldp x24,x23,[sp, #0x30]
00ab6264	ldp x26,x25,[sp, #0x20]
00ab6268	ldp x28,x27,[sp, #0x10]
00ab626c	add sp,sp,#0x70
00ab6270	ret
