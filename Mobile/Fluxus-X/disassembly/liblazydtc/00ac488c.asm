; ossl_method_store_fetch @ 00ac488c
00ac488c	sub sp,sp,#0x80
00ac4890	stp x24,x23,[sp, #0x40]
00ac4894	stp x22,x21,[sp, #0x50]
00ac4898	stp x20,x19,[sp, #0x60]
00ac489c	mov x21,x4
00ac48a0	mov x20,x3
00ac48a4	mov x22,x2
00ac48a8	mov w23,w1
00ac48ac	mov x19,x0
00ac48b0	stp x28,x27,[sp, #0x20]
00ac48b4	stp x26,x25,[sp, #0x30]
00ac48b8	stp x29,x30,[sp, #0x70]
00ac48bc	add x29,sp,#0x70
00ac48c0	cbz x3,0x00ac4934
00ac48c4	ldr x27,[x20]
00ac48c8	cbz x19,0x00ac493c
00ac48cc	cmp w23,#0x1
00ac48d0	b.lt 0x00ac493c
00ac48d4	mov w24,wzr
00ac48d8	cbz x21,0x00ac4940
00ac48dc	ldr x0,[x19]
00ac48e0	bl 0x00c3def0
00ac48e4	cbz w0,0x00ac48f8
00ac48e8	mov w0,#0x40
00ac48ec	mov x1,xzr
00ac48f0	bl 0x00c35500
00ac48f4	cbz w0,0x00ac493c
00ac48f8	ldr x0,[x19, #0x10]
00ac48fc	bl 0x00c35680
00ac4900	cbz w0,0x00ac493c
00ac4904	ldr x0,[x19, #0x8]
00ac4908	sxtw x1,w23
00ac490c	bl 0x00c3ec70
00ac4910	cbz x0,0x00ac4964
00ac4914	mov x23,x0
00ac4918	cbz x22,0x00ac4974
00ac491c	ldr x0,[x19]
00ac4920	mov x1,x22
00ac4924	mov w2,wzr
00ac4928	bl 0x00c3ce10
00ac492c	mov x25,x0
00ac4930	b 0x00ac4978
00ac4934	mov x27,xzr
00ac4938	cbnz x19,0x00ac48cc
00ac493c	mov w24,wzr
00ac4940	mov w0,w24
00ac4944	ldp x29,x30,[sp, #0x70]
00ac4948	ldp x20,x19,[sp, #0x60]
00ac494c	ldp x22,x21,[sp, #0x50]
00ac4950	ldp x24,x23,[sp, #0x40]
00ac4954	ldp x26,x25,[sp, #0x30]
00ac4958	ldp x28,x27,[sp, #0x20]
00ac495c	add sp,sp,#0x80
00ac4960	ret
00ac4964	ldr x0,[x19, #0x10]
00ac4968	bl 0x00c35690
00ac496c	mov w24,wzr
00ac4970	b 0x00ac4940
00ac4974	mov x25,xzr
00ac4978	ldr x0,[x19]
00ac497c	adrp x2,0xc7c000
00ac4980	add x2,x2,#0x670
00ac4984	orr w1,wzr,#0xe
00ac4988	bl 0x00c3b520
00ac498c	cbz x0,0x00ac49c0
00ac4990	ldr x26,[x0]
00ac4994	cbz x26,0x00ac49c0
00ac4998	cbz x25,0x00ac49c8
00ac499c	mov x0,x25
00ac49a0	mov x1,x26
00ac49a4	bl 0x00c3ce40
00ac49a8	mov x26,x0
00ac49ac	mov x0,x25
00ac49b0	bl 0x00c3b670
00ac49b4	mov x25,x26
00ac49b8	cbnz x26,0x00ac49c8
00ac49bc	b 0x00ac4aec
00ac49c0	mov x26,x25
00ac49c4	cbz x25,0x00ac4a68
00ac49c8	mov x0,x26
00ac49cc	bl 0x00c3f850
00ac49d0	ldr x8,[x23, #0x8]
00ac49d4	str w0,[sp, #0x1c]
00ac49d8	mov x0,x8
00ac49dc	bl 0x00c325e0
00ac49e0	cmp w0,#0x1
00ac49e4	b.lt 0x00ac4aec
00ac49e8	stp x21,x25,[sp, #0x8]
00ac49ec	mov w28,wzr
00ac49f0	mov w24,wzr
00ac49f4	mov x22,xzr
00ac49f8	mov w21,#0xffffffff
00ac49fc	ldr x0,[x23, #0x8]
00ac4a00	mov w1,w28
00ac4a04	bl 0x00c32610
00ac4a08	cbz x0,0x00ac4a48
00ac4a0c	mov x25,x0
00ac4a10	cbz x27,0x00ac4a20
00ac4a14	ldr x8,[x25]
00ac4a18	cmp x8,x27
00ac4a1c	b.ne 0x00ac4a48
00ac4a20	ldr x1,[x25, #0x8]
00ac4a24	mov x0,x26
00ac4a28	bl 0x00c3f860
00ac4a2c	cmp w0,w21
00ac4a30	csel x22,x22,x25,le
00ac4a34	csinc w24,w24,wzr,le
00ac4a38	csel w21,w21,w0,le
00ac4a3c	b.le 0x00ac4a48
00ac4a40	ldr w8,[sp, #0x1c]
00ac4a44	cbz w8,0x00ac4abc
00ac4a48	ldr x0,[x23, #0x8]
00ac4a4c	add w28,w28,#0x1
00ac4a50	bl 0x00c325e0
00ac4a54	cmp w28,w0
00ac4a58	b.lt 0x00ac49fc
00ac4a5c	cbnz w24,0x00ac4ac4
00ac4a60	ldr x25,[sp, #0x10]
00ac4a64	b 0x00ac4af0
00ac4a68	ldr x0,[x23, #0x8]
00ac4a6c	bl 0x00c325e0
00ac4a70	cmp w0,#0x1
00ac4a74	b.lt 0x00ac4ab4
00ac4a78	mov w24,wzr
00ac4a7c	ldr x0,[x23, #0x8]
00ac4a80	mov w1,w24
00ac4a84	bl 0x00c32610
00ac4a88	cbz x0,0x00ac4aa0
00ac4a8c	mov x22,x0
00ac4a90	cbz x27,0x00ac4b04
00ac4a94	ldr x8,[x22]
00ac4a98	cmp x8,x27
00ac4a9c	b.eq 0x00ac4b04
00ac4aa0	ldr x0,[x23, #0x8]
00ac4aa4	add w24,w24,#0x1
00ac4aa8	bl 0x00c325e0
00ac4aac	cmp w24,w0
00ac4ab0	b.lt 0x00ac4a7c
00ac4ab4	mov x25,xzr
00ac4ab8	b 0x00ac4aec
00ac4abc	mov w24,#0x1
00ac4ac0	mov x22,x25
00ac4ac4	ldp x21,x25,[sp, #0x8]
00ac4ac8	ldp x0,x8,[x22, #0x10]
00ac4acc	blr x8
00ac4ad0	cbz w0,0x00ac4aec
00ac4ad4	ldr x8,[x22, #0x10]
00ac4ad8	str x8,[x21]
00ac4adc	cbz x20,0x00ac4af0
00ac4ae0	ldr x8,[x22]
00ac4ae4	str x8,[x20]
00ac4ae8	b 0x00ac4af0
00ac4aec	mov w24,wzr
00ac4af0	ldr x0,[x19, #0x10]
00ac4af4	bl 0x00c35690
00ac4af8	mov x0,x25
00ac4afc	bl 0x00c3b670
00ac4b00	b 0x00ac4940
00ac4b04	mov x25,xzr
00ac4b08	mov w24,#0x1
00ac4b0c	b 0x00ac4ac8
