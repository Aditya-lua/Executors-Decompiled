; mbedtls_sha3 @ 00baf330
00baf330	sub sp,sp,#0x130
00baf334	str x28,[sp, #0xe0]
00baf338	stp x24,x23,[sp, #0xf0]
00baf33c	stp x22,x21,[sp, #0x100]
00baf340	stp x20,x19,[sp, #0x110]
00baf344	stp x29,x30,[sp, #0x120]
00baf348	add x29,sp,#0x120
00baf34c	mrs x24,tpidr_el0
00baf350	ldr x8,[x24, #0x28]
00baf354	mov x21,x2
00baf358	mov x22,x1
00baf35c	mov w23,w0
00baf360	add x0,sp,#0x8
00baf364	mov w2,#0xd0
00baf368	mov w1,wzr
00baf36c	mov x19,x4
00baf370	mov x20,x3
00baf374	stur x8,[x29, #-0x48]
00baf378	bl 0x00c301c0
00baf37c	sub w8,w23,#0x1
00baf380	cmp w8,#0x3
00baf384	b.hi 0x00baf3f8
00baf388	mov x9,#0x1c
00baf38c	mov x10,#0x90
00baf390	movk x9,#0x20, LSL #16
00baf394	movk x10,#0x88, LSL #16
00baf398	mov w8,w8
00baf39c	movk x9,#0x30, LSL #32
00baf3a0	movk x10,#0x68, LSL #32
00baf3a4	movk x9,#0x40, LSL #48
00baf3a8	movk x10,#0x48, LSL #48
00baf3ac	lsl x8,x8,#0x4
00baf3b0	lsr x9,x9,x8
00baf3b4	lsr x8,x10,x8
00baf3b8	add x0,sp,#0x8
00baf3bc	mov w2,#0xcc
00baf3c0	mov w1,wzr
00baf3c4	strh w9,[sp, #0xd4]
00baf3c8	strh w8,[sp, #0xd6]
00baf3cc	bl 0x00c301c0
00baf3d0	add x0,sp,#0x8
00baf3d4	mov x1,x22
00baf3d8	mov x2,x21
00baf3dc	bl 0x00c42b30
00baf3e0	add x0,sp,#0x8
00baf3e4	mov x1,x20
00baf3e8	mov x2,x19
00baf3ec	bl 0x00c42af0
00baf3f0	mov w19,w0
00baf3f4	b 0x00baf3fc
00baf3f8	mov w19,#0xffffff8a
00baf3fc	add x0,sp,#0x8
00baf400	mov w1,#0xd0
00baf404	bl 0x00c42220
00baf408	ldr x8,[x24, #0x28]
00baf40c	ldur x9,[x29, #-0x48]
00baf410	cmp x8,x9
00baf414	b.ne 0x00baf438
00baf418	mov w0,w19
00baf41c	ldp x29,x30,[sp, #0x120]
00baf420	ldp x20,x19,[sp, #0x110]
00baf424	ldp x22,x21,[sp, #0x100]
00baf428	ldp x24,x23,[sp, #0xf0]
00baf42c	ldr x28,[sp, #0xe0]
00baf430	add sp,sp,#0x130
00baf434	ret
00baf438	bl 0x00c2fec0
