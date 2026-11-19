; BIO_snprintf @ 009fe528
009fe528	sub sp,sp,#0x130
009fe52c	orr x9,xzr,#-0x7f00000080
009fe530	stp x29,x30,[sp, #0x120]
009fe534	add x29,sp,#0x120
009fe538	movk x9,#0xffd8
009fe53c	mov x10,sp
009fe540	add x11,sp,#0x88
009fe544	add x12,x29,#0x10
009fe548	stur x9,[x29, #-0x58]
009fe54c	add x9,x10,#0x80
009fe550	add x10,x11,#0x28
009fe554	stp x12,x10,[x29, #-0x70]
009fe558	stur x9,[x29, #-0x60]
009fe55c	stp q0,q1,[sp]
009fe560	ldp q1,q0,[x29, #-0x70]
009fe564	mov x8,x2
009fe568	stp x6,x7,[sp, #0xa0]
009fe56c	stp x4,x5,[sp, #0x90]
009fe570	str x3,[sp, #0x88]
009fe574	stur x0,[x29, #-0x8]
009fe578	stur x1,[x29, #-0x18]
009fe57c	sub x0,x29,#0x8
009fe580	sub x2,x29,#0x18
009fe584	sub x3,x29,#0x20
009fe588	sub x4,x29,#0x24
009fe58c	sub x6,x29,#0x50
009fe590	mov x1,xzr
009fe594	mov x5,x8
009fe598	str x28,[sp, #0x110]
009fe59c	stp q6,q7,[sp, #0x60]
009fe5a0	stp q4,q5,[sp, #0x40]
009fe5a4	stp q2,q3,[sp, #0x20]
009fe5a8	stp q1,q0,[x29, #-0x50]
009fe5ac	bl 0x009fda6c
009fe5b0	mov w8,w0
009fe5b4	mov w0,#0xffffffff
009fe5b8	cbz w8,0x009fe5d4
009fe5bc	ldur w8,[x29, #-0x24]
009fe5c0	cbnz w8,0x009fe5d4
009fe5c4	ldur x8,[x29, #-0x20]
009fe5c8	lsr x9,x8,#0x1f
009fe5cc	cmp x9,#0x0
009fe5d0	csinv w0,w8,wzr,eq
009fe5d4	ldp x29,x30,[sp, #0x120]
009fe5d8	ldr x28,[sp, #0x110]
009fe5dc	add sp,sp,#0x130
009fe5e0	ret
