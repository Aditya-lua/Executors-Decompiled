; OSSL_PARAM_get_int64 @ 00a9e7dc
00a9e7dc	str x21,[sp, #-0x30]!
00a9e7e0	mov x8,x0
00a9e7e4	mov w0,wzr
00a9e7e8	stp x20,x19,[sp, #0x10]
00a9e7ec	stp x29,x30,[sp, #0x20]
00a9e7f0	add x29,sp,#0x20
00a9e7f4	cbz x8,0x00a9e994
00a9e7f8	mov x19,x1
00a9e7fc	cbz x1,0x00a9e994
00a9e800	ldr w9,[x8, #0x8]
00a9e804	cmp w9,#0x3
00a9e808	b.eq 0x00a9e840
00a9e80c	cmp w9,#0x2
00a9e810	b.eq 0x00a9e890
00a9e814	cmp w9,#0x1
00a9e818	mov w0,wzr
00a9e81c	b.ne 0x00a9e994
00a9e820	ldr x21,[x8, #0x18]
00a9e824	subs x9,x21,#0x8
00a9e828	b.eq 0x00a9e8b0
00a9e82c	cmp x21,#0x4
00a9e830	b.ne 0x00a9e8bc
00a9e834	ldr x8,[x8, #0x10]
00a9e838	ldrsw x8,[x8]
00a9e83c	b 0x00a9e984
00a9e840	ldr x9,[x8, #0x18]
00a9e844	mov w0,wzr
00a9e848	cmp x9,#0x8
00a9e84c	b.ne 0x00a9e994
00a9e850	ldr x8,[x8, #0x10]
00a9e854	adrp x9,0x29b000
00a9e858	ldr d1,[x9, #0x708]
00a9e85c	ldr d0,[x8]
00a9e860	fcmp d0,d1
00a9e864	b.lt 0x00a9e990
00a9e868	adrp x8,0x29a000
00a9e86c	ldr d1,[x8, #0xe78]
00a9e870	mov w0,wzr
00a9e874	fcmp d0,d1
00a9e878	b.pl 0x00a9e994
00a9e87c	fcvtzs x8,d0
00a9e880	scvtf d1,x8
00a9e884	fcmp d0,d1
00a9e888	b.eq 0x00a9e984
00a9e88c	b 0x00a9e990
00a9e890	ldr x21,[x8, #0x18]
00a9e894	subs x9,x21,#0x8
00a9e898	b.eq 0x00a9e8e4
00a9e89c	cmp x21,#0x4
00a9e8a0	b.ne 0x00a9e8f4
00a9e8a4	ldr x8,[x8, #0x10]
00a9e8a8	ldr w8,[x8]
00a9e8ac	b 0x00a9e984
00a9e8b0	ldr x8,[x8, #0x10]
00a9e8b4	ldr x8,[x8]
00a9e8b8	b 0x00a9e984
00a9e8bc	ldr x20,[x8, #0x10]
00a9e8c0	cmp x21,#0x7
00a9e8c4	add x8,x20,x21
00a9e8c8	ldursb w8,[x8, #-0x1]
00a9e8cc	asr w1,w8,#0x7
00a9e8d0	b.hi 0x00a9e928
00a9e8d4	mov w8,#0x8
00a9e8d8	sub x2,x8,x21
00a9e8dc	add x0,x19,x21
00a9e8e0	b 0x00a9e910
00a9e8e4	ldr x8,[x8, #0x10]
00a9e8e8	ldr x8,[x8]
00a9e8ec	tbz x8,#0x3f,0x00a9e984
00a9e8f0	b 0x00a9e990
00a9e8f4	ldr x20,[x8, #0x10]
00a9e8f8	cmp x21,#0x7
00a9e8fc	b.hi 0x00a9e95c
00a9e900	mov w8,#0x8
00a9e904	sub x2,x8,x21
00a9e908	add x0,x19,x21
00a9e90c	mov w1,wzr
00a9e910	bl 0x00c301c0
00a9e914	mov x0,x19
00a9e918	mov x1,x20
00a9e91c	mov x2,x21
00a9e920	bl 0x00c2ffd0
00a9e924	b 0x00a9e988
00a9e928	mov x8,xzr
00a9e92c	add x10,x20,#0x8
00a9e930	ldrb w11,[x10, x8]
00a9e934	cmp w11,w1, UXTB 
00a9e938	b.ne 0x00a9e990
00a9e93c	add x8,x8,#0x1
00a9e940	cmp x8,x9
00a9e944	b.cc 0x00a9e930
00a9e948	ldrb w8,[x20, #0x7]
00a9e94c	eor w8,w8,w1
00a9e950	sxtb w8,w8
00a9e954	tbz w8,#0x1f,0x00a9e980
00a9e958	b 0x00a9e990
00a9e95c	mov x8,xzr
00a9e960	add x10,x20,#0x8
00a9e964	ldrb w11,[x10, x8]
00a9e968	cbnz w11,0x00a9e990
00a9e96c	add x8,x8,#0x1
00a9e970	cmp x8,x9
00a9e974	b.cc 0x00a9e964
00a9e978	ldrsb w8,[x20, #0x7]
00a9e97c	tbnz w8,#0x1f,0x00a9e990
00a9e980	ldr x8,[x20]
00a9e984	str x8,[x19]
00a9e988	mov w0,#0x1
00a9e98c	b 0x00a9e994
00a9e990	mov w0,wzr
00a9e994	ldp x29,x30,[sp, #0x20]
00a9e998	ldp x20,x19,[sp, #0x10]
00a9e99c	ldr x21,[sp], #0x30
00a9e9a0	ret
