; ossl_curve448_scalar_decode_long @ 00a4c4c8
00a4c4c8	sub sp,sp,#0xd0
00a4c4cc	stp x20,x19,[sp, #0xb0]
00a4c4d0	mov x19,x0
00a4c4d4	stp x28,x27,[sp, #0x70]
00a4c4d8	stp x26,x25,[sp, #0x80]
00a4c4dc	stp x24,x23,[sp, #0x90]
00a4c4e0	stp x22,x21,[sp, #0xa0]
00a4c4e4	stp x29,x30,[sp, #0xc0]
00a4c4e8	add x29,sp,#0xc0
00a4c4ec	cbz x2,0x00a4c56c
00a4c4f0	mov x9,#0x2493
00a4c4f4	movk x9,#0x9249, LSL #16
00a4c4f8	movk x9,#0x4924, LSL #32
00a4c4fc	lsr x8,x2,#0x3
00a4c500	movk x9,#0x2492, LSL #48
00a4c504	orr w10,wzr,#0x38
00a4c508	umulh x8,x8,x9
00a4c50c	mul x8,x8,x10
00a4c510	cmp x2,x8
00a4c514	sub x9,x8,#0x38
00a4c518	csel x27,x9,x8,eq
00a4c51c	mov x21,x2
00a4c520	mov x20,x1
00a4c524	add x1,x1,x27
00a4c528	sub x2,x2,x27
00a4c52c	add x0,sp,#0x38
00a4c530	bl 0x00a4c270
00a4c534	cmp x21,#0x38
00a4c538	b.ne 0x00a4c580
00a4c53c	adrp x2,0xcb5000
00a4c540	ldr x2,[x2, #0x538]
00a4c544	add x1,sp,#0x38
00a4c548	mov x0,x19
00a4c54c	bl 0x00a4bc44
00a4c550	adrp x2,0x765000
00a4c554	add x2,x2,#0xef0
00a4c558	mov x0,x19
00a4c55c	mov x1,x19
00a4c560	bl 0x00a4bc44
00a4c564	add x0,sp,#0x38
00a4c568	b 0x00a4c824
00a4c56c	movi v0.2D,#0x0
00a4c570	str xzr,[x19, #0x30]
00a4c574	stp q0,q0,[x19, #0x10]
00a4c578	str q0,[x19]
00a4c57c	b 0x00a4c82c
00a4c580	cbz x27,0x00a4c7f4
00a4c584	mov x23,#0x44f3
00a4c588	mov x22,#0x8f55
00a4c58c	mov x25,#0x3690
00a4c590	movk x23,#0xab58, LSL #16
00a4c594	movk x22,#0x8dc5, LSL #16
00a4c598	movk x25,#0xaed6, LSL #16
00a4c59c	adrp x21,0x765000
00a4c5a0	movk x23,#0xc292, LSL #32
00a4c5a4	movk x22,#0xc272, LSL #32
00a4c5a8	movk x25,#0xdb49, LSL #32
00a4c5ac	mov x26,#-0xdc17
00a4c5b0	add x21,x21,#0xef0
00a4c5b4	mov x24,#-0x1
00a4c5b8	movk x23,#0x2378, LSL #48
00a4c5bc	movk x22,#0x216c, LSL #48
00a4c5c0	movk x25,#0xc44e, LSL #48
00a4c5c4	movk x26,#0x7cca, LSL #16
00a4c5c8	add x0,sp,#0x38
00a4c5cc	add x1,sp,#0x38
00a4c5d0	mov x2,x21
00a4c5d4	sub x28,x27,#0x38
00a4c5d8	bl 0x00a4bc44
00a4c5dc	add x8,x20,x27
00a4c5e0	sub x1,x8,#0x38
00a4c5e4	mov x0,sp
00a4c5e8	orr w2,wzr,#0x38
00a4c5ec	bl 0x00a4c270
00a4c5f0	adrp x2,0xcb5000
00a4c5f4	ldr x2,[x2, #0x538]
00a4c5f8	mov x0,sp
00a4c5fc	mov x1,sp
00a4c600	bl 0x00a4bc44
00a4c604	mov x0,sp
00a4c608	mov x1,sp
00a4c60c	mov x2,x21
00a4c610	bl 0x00a4bc44
00a4c614	ldp x8,x10,[sp, #0x38]
00a4c618	ldp x9,x11,[sp]
00a4c61c	ldp x12,x14,[sp, #0x48]
00a4c620	ldp x13,x15,[sp, #0x10]
00a4c624	mov x27,x28
00a4c628	adds x8,x9,x8
00a4c62c	adcs x9,xzr,xzr
00a4c630	adds x9,x9,x10
00a4c634	adcs x10,xzr,xzr
00a4c638	adds x9,x9,x11
00a4c63c	adcs x10,x10,xzr
00a4c640	adds x10,x10,x12
00a4c644	adcs x12,xzr,xzr
00a4c648	adds x10,x10,x13
00a4c64c	adcs x12,x12,xzr
00a4c650	ldp x16,x11,[sp, #0x58]
00a4c654	adds x12,x12,x14
00a4c658	adcs x14,xzr,xzr
00a4c65c	ldp x17,x13,[sp, #0x20]
00a4c660	adds x12,x12,x15
00a4c664	adcs x14,x14,xzr
00a4c668	adds x14,x14,x16
00a4c66c	adcs x16,xzr,xzr
00a4c670	adds x14,x14,x17
00a4c674	adcs x16,x16,xzr
00a4c678	ldr x15,[sp, #0x68]
00a4c67c	adds x11,x16,x11
00a4c680	adcs x16,xzr,xzr
00a4c684	ldr x17,[sp, #0x30]
00a4c688	adds x11,x11,x13
00a4c68c	adcs x13,x16,xzr
00a4c690	adds x13,x13,x15
00a4c694	mov x16,#0xbb0d
00a4c698	adcs x15,xzr,xzr
00a4c69c	movk x16,#0x54a7, LSL #16
00a4c6a0	adds x13,x13,x17
00a4c6a4	movk x16,#0x3d6d, LSL #32
00a4c6a8	adcs x15,x15,xzr
00a4c6ac	movk x16,#0xdc87, LSL #48
00a4c6b0	adds x8,x8,x16
00a4c6b4	adcs x16,xzr,x24
00a4c6b8	asr x17,x16,#0x3f
00a4c6bc	adds x9,x16,x9
00a4c6c0	adcs x16,x17,xzr
00a4c6c4	mov x17,#0x70ab
00a4c6c8	movk x17,#0x723a, LSL #16
00a4c6cc	movk x17,#0x3d8d, LSL #32
00a4c6d0	movk x17,#0xde93, LSL #48
00a4c6d4	adds x9,x9,x17
00a4c6d8	adcs x16,x16,x24
00a4c6dc	asr x17,x16,#0x3f
00a4c6e0	adds x10,x10,x16
00a4c6e4	adcs x16,x17,xzr
00a4c6e8	mov x17,#0xc970
00a4c6ec	movk x17,#0x5129, LSL #16
00a4c6f0	movk x17,#0x24b6, LSL #32
00a4c6f4	movk x17,#0x3bb1, LSL #48
00a4c6f8	adds x10,x10,x17
00a4c6fc	adcs x16,x16,x24
00a4c700	asr x17,x16,#0x3f
00a4c704	adds x12,x12,x16
00a4c708	adcs x16,x17,xzr
00a4c70c	mov w17,#0xdc17
00a4c710	movk w17,#0x8335, LSL #16
00a4c714	adds x12,x12,x17
00a4c718	adcs x16,x16,x24
00a4c71c	asr x17,x16,#0x3f
00a4c720	adds x14,x14,x16
00a4c724	adcs x16,x17,xzr
00a4c728	adds x14,x14,#0x1
00a4c72c	adcs x16,x16,x24
00a4c730	asr x17,x16,#0x3f
00a4c734	adds x11,x11,x16
00a4c738	adcs x16,x17,xzr
00a4c73c	adds x11,x11,#0x1
00a4c740	adcs x16,x16,x24
00a4c744	asr x17,x16,#0x3f
00a4c748	adds x13,x13,x16
00a4c74c	adcs x16,x17,xzr
00a4c750	orr x17,xzr,#-0x3fffffffffffffff
00a4c754	adds x13,x13,x17
00a4c758	adcs x16,x16,x24
00a4c75c	add x15,x16,x15
00a4c760	and x16,x15,x23
00a4c764	adds x8,x8,x16
00a4c768	and x17,x15,x22
00a4c76c	str x8,[sp, #0x38]
00a4c770	adcs x8,xzr,xzr
00a4c774	adds x9,x9,x17
00a4c778	adcs x17,xzr,xzr
00a4c77c	adds x8,x9,x8
00a4c780	and x16,x15,x25
00a4c784	adcs x17,x17,xzr
00a4c788	str x8,[sp, #0x40]
00a4c78c	adds x8,x10,x16
00a4c790	adcs x10,xzr,xzr
00a4c794	adds x8,x8,x17
00a4c798	and x9,x15,x26
00a4c79c	adcs x10,x10,xzr
00a4c7a0	str x8,[sp, #0x48]
00a4c7a4	adds x8,x12,x9
00a4c7a8	adcs x9,xzr,xzr
00a4c7ac	adds x8,x8,x10
00a4c7b0	adcs x9,x9,xzr
00a4c7b4	str x8,[sp, #0x50]
00a4c7b8	adds x8,x14,x15
00a4c7bc	adcs x10,xzr,xzr
00a4c7c0	adds x8,x8,x9
00a4c7c4	adcs x9,x10,xzr
00a4c7c8	str x8,[sp, #0x58]
00a4c7cc	adds x8,x11,x15
00a4c7d0	adcs x10,xzr,xzr
00a4c7d4	adds x8,x8,x9
00a4c7d8	adcs x9,x10,xzr
00a4c7dc	str x8,[sp, #0x60]
00a4c7e0	add x8,x9,x13
00a4c7e4	and x9,x15,#0x3fffffffffffffff
00a4c7e8	add x8,x9,x8
00a4c7ec	str x8,[sp, #0x68]
00a4c7f0	cbnz x28,0x00a4c5c8
00a4c7f4	ldr x8,[sp, #0x68]
00a4c7f8	add x0,sp,#0x38
00a4c7fc	orr w1,wzr,#0x38
00a4c800	str x8,[x19, #0x30]
00a4c804	ldur q0,[sp, #0x58]
00a4c808	str q0,[x19, #0x20]
00a4c80c	ldur q0,[sp, #0x48]
00a4c810	str q0,[x19, #0x10]
00a4c814	ldur q0,[sp, #0x38]
00a4c818	str q0,[x19]
00a4c81c	bl 0x00c34750
00a4c820	mov x0,sp
00a4c824	orr w1,wzr,#0x38
00a4c828	bl 0x00c34750
00a4c82c	ldp x29,x30,[sp, #0xc0]
00a4c830	ldp x20,x19,[sp, #0xb0]
00a4c834	ldp x22,x21,[sp, #0xa0]
00a4c838	ldp x24,x23,[sp, #0x90]
00a4c83c	ldp x26,x25,[sp, #0x80]
00a4c840	ldp x28,x27,[sp, #0x70]
00a4c844	add sp,sp,#0xd0
00a4c848	ret
