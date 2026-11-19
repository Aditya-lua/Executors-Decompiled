; ossl_method_store_remove @ 00ac4550
00ac4550	str x23,[sp, #-0x40]!
00ac4554	stp x22,x21,[sp, #0x10]
00ac4558	stp x20,x19,[sp, #0x20]
00ac455c	mov w21,w1
00ac4560	mov x19,x0
00ac4564	mov w0,wzr
00ac4568	stp x29,x30,[sp, #0x30]
00ac456c	add x29,sp,#0x30
00ac4570	cbz x19,0x00ac4634
00ac4574	cmp w21,#0x1
00ac4578	b.lt 0x00ac4634
00ac457c	mov x20,x2
00ac4580	cbz x2,0x00ac4634
00ac4584	ldr x0,[x19, #0x10]
00ac4588	bl 0x00c356a0
00ac458c	cbz w0,0x00ac4634
00ac4590	ldr x0,[x19, #0x8]
00ac4594	sxtw x21,w21
00ac4598	mov x1,x21
00ac459c	bl 0x00c3ec70
00ac45a0	cbz x0,0x00ac45d4
00ac45a4	mov x22,x0
00ac45a8	ldr x0,[x0, #0x10]
00ac45ac	bl 0x00c35880
00ac45b0	ldr x8,[x19, #0x20]
00ac45b4	adrp x1,0xac4000
00ac45b8	add x1,x1,#0xea4
00ac45bc	sub x8,x8,x0
00ac45c0	str x8,[x19, #0x20]
00ac45c4	ldr x0,[x22, #0x10]
00ac45c8	bl 0x00c395e0
00ac45cc	ldr x0,[x22, #0x10]
00ac45d0	bl 0x00c3de10
00ac45d4	ldr x0,[x19, #0x8]
00ac45d8	mov x1,x21
00ac45dc	bl 0x00c3ec70
00ac45e0	cbz x0,0x00ac4628
00ac45e4	mov x21,x0
00ac45e8	ldr x0,[x0, #0x8]
00ac45ec	bl 0x00c325e0
00ac45f0	cmp w0,#0x1
00ac45f4	b.lt 0x00ac4628
00ac45f8	mov w22,wzr
00ac45fc	ldr x0,[x21, #0x8]
00ac4600	mov w1,w22
00ac4604	bl 0x00c32610
00ac4608	ldr x8,[x0, #0x10]
00ac460c	cmp x8,x20
00ac4610	b.eq 0x00ac4648
00ac4614	ldr x0,[x21, #0x8]
00ac4618	add w22,w22,#0x1
00ac461c	bl 0x00c325e0
00ac4620	cmp w22,w0
00ac4624	b.lt 0x00ac45fc
00ac4628	ldr x0,[x19, #0x10]
00ac462c	bl 0x00c35690
00ac4630	mov w0,wzr
00ac4634	ldp x29,x30,[sp, #0x30]
00ac4638	ldp x20,x19,[sp, #0x20]
00ac463c	ldp x22,x21,[sp, #0x10]
00ac4640	ldr x23,[sp], #0x40
00ac4644	ret
00ac4648	mov x23,x0
00ac464c	cbz x0,0x00ac4670
00ac4650	ldr x8,[x23, #0x20]
00ac4654	mov x0,x20
00ac4658	blr x8
00ac465c	adrp x1,0x2ca000
00ac4660	add x1,x1,#0x2a4
00ac4664	mov w2,#0xd4
00ac4668	mov x0,x23
00ac466c	bl 0x00c32310
00ac4670	ldr x0,[x21, #0x8]
00ac4674	mov w1,w22
00ac4678	bl 0x00c35320
00ac467c	ldr x0,[x19, #0x10]
00ac4680	bl 0x00c35690
00ac4684	mov w0,#0x1
00ac4688	b 0x00ac4634
