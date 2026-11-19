; ossl_provider_set_operation_bit @ 00aa4464
00aa4464	stp x22,x21,[sp, #-0x30]!
00aa4468	stp x20,x19,[sp, #0x10]
00aa446c	stp x29,x30,[sp, #0x20]
00aa4470	mov x19,x0
00aa4474	ldr x0,[x0, #0xb8]
00aa4478	add x29,sp,#0x20
00aa447c	mov x20,x1
00aa4480	bl 0x00c356a0
00aa4484	cbz w0,0x00aa453c
00aa4488	ldr x8,[x19, #0xb0]
00aa448c	lsr x22,x20,#0x3
00aa4490	cmp x8,x22
00aa4494	b.hi 0x00aa44d4
00aa4498	ldr x0,[x19, #0xa8]
00aa449c	add x21,x22,#0x1
00aa44a0	adrp x2,0x2aa000
00aa44a4	add x2,x2,#0x4b5
00aa44a8	mov w3,#0x665
00aa44ac	mov x1,x21
00aa44b0	bl 0x00c356f0
00aa44b4	cbz x0,0x00aa4500
00aa44b8	ldr x8,[x19, #0xb0]
00aa44bc	str x0,[x19, #0xa8]
00aa44c0	mov w1,wzr
00aa44c4	add x0,x0,x8
00aa44c8	sub x2,x21,x8
00aa44cc	bl 0x00c301c0
00aa44d0	str x21,[x19, #0xb0]
00aa44d4	ldr x8,[x19, #0xa8]
00aa44d8	and w10,w20,#0x7
00aa44dc	mov w11,#0x1
00aa44e0	lsl w10,w11,w10
00aa44e4	ldrb w9,[x8, x22]
00aa44e8	orr w9,w9,w10
00aa44ec	strb w9,[x8, x22]
00aa44f0	ldr x0,[x19, #0xb8]
00aa44f4	bl 0x00c35690
00aa44f8	mov w0,#0x1
00aa44fc	b 0x00aa453c
00aa4500	ldr x0,[x19, #0xb8]
00aa4504	bl 0x00c35690
00aa4508	bl 0x00c342a0
00aa450c	adrp x0,0x2aa000
00aa4510	adrp x2,0x2a0000
00aa4514	add x0,x0,#0x4b5
00aa4518	add x2,x2,#0x68f
00aa451c	mov w1,#0x669
00aa4520	bl 0x00c342b0
00aa4524	mov w1,#0x100
00aa4528	orr w0,wzr,#0xf
00aa452c	movk w1,#0xc, LSL #16
00aa4530	mov x2,xzr
00aa4534	bl 0x00c342c0
00aa4538	mov w0,wzr
00aa453c	ldp x29,x30,[sp, #0x20]
00aa4540	ldp x20,x19,[sp, #0x10]
00aa4544	ldp x22,x21,[sp], #0x30
00aa4548	ret
