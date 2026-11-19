; mbedtls_ccm_update @ 00b6b5a8
00b6b5a8	sub sp,sp,#0xc0
00b6b5ac	stp x28,x27,[sp, #0x60]
00b6b5b0	stp x26,x25,[sp, #0x70]
00b6b5b4	stp x24,x23,[sp, #0x80]
00b6b5b8	stp x22,x21,[sp, #0x90]
00b6b5bc	stp x20,x19,[sp, #0xa0]
00b6b5c0	stp x29,x30,[sp, #0xb0]
00b6b5c4	add x29,sp,#0xb0
00b6b5c8	mrs x23,tpidr_el0
00b6b5cc	ldr x8,[x23, #0x28]
00b6b5d0	mov x20,x3
00b6b5d4	mov x21,x2
00b6b5d8	mov x19,x0
00b6b5dc	str x8,[sp, #0x58]
00b6b5e0	ldrb w8,[x0, #0xa8]
00b6b5e4	mov x22,x1
00b6b5e8	tbnz w8,#0x4,0x00b6b620
00b6b5ec	ldr x8,[x19, #0x30]
00b6b5f0	cbz x8,0x00b6b618
00b6b5f4	cmp x4,x21
00b6b5f8	orr w26,wzr,#0xfffffff3
00b6b5fc	b.cc 0x00b6bc7c
00b6b600	ldr x8,[x19, #0x38]
00b6b604	ldr x9,[x19, #0x20]
00b6b608	add x8,x8,x21
00b6b60c	cmp x8,x9
00b6b610	b.ls 0x00b6b628
00b6b614	b 0x00b6bc7c
00b6b618	cmp x4,x21
00b6b61c	b.cs 0x00b6b628
00b6b620	orr w26,wzr,#0xfffffff3
00b6b624	b 0x00b6bc7c
00b6b628	str x21,[x5]
00b6b62c	cbz x21,0x00b6bc3c
00b6b630	add x8,x19,#0x10
00b6b634	str x8,[sp, #0x18]
00b6b638	add x8,sp,#0x48
00b6b63c	str x23,[sp]
00b6b640	add x23,x19,#0x48
00b6b644	sub x9,x19,#0x1
00b6b648	add x28,sp,#0x20
00b6b64c	sub x8,x8,#0x1
00b6b650	orr w24,wzr,#0xf
00b6b654	stp x9,x8,[sp, #0x8]
00b6b658	b 0x00b6b6a0
00b6b65c	and x14,x12,#-0x20
00b6b660	mov x15,xzr
00b6b664	orr x13,x11,x14
00b6b668	orr x16,x11,x15
00b6b66c	add x17,x10,x16
00b6b670	add x16,x22,x16
00b6b674	ldp q0,q1,[x17]
00b6b678	ldp q2,q3,[x16]
00b6b67c	add x15,x15,#0x20
00b6b680	cmp x14,x15
00b6b684	eor v0.16B,v2.16B,v0.16B
00b6b688	eor v1.16B,v3.16B,v1.16B
00b6b68c	stp q0,q1,[x17]
00b6b690	b.ne 0x00b6b668
00b6b694	cmp x12,x14
00b6b698	b.eq 0x00b6b788
00b6b69c	b 0x00b6b754
00b6b6a0	ldr x9,[x19, #0x38]
00b6b6a4	ldr w8,[x19, #0x44]
00b6b6a8	mov w11,#0x10
00b6b6ac	and x27,x9,#0xf
00b6b6b0	sub x11,x11,x27
00b6b6b4	cmp x11,x21
00b6b6b8	orr w10,w8,#0x2
00b6b6bc	csel x25,x21,x11,hi
00b6b6c0	add x9,x25,x9
00b6b6c4	cmp w10,#0x3
00b6b6c8	str x9,[x19, #0x38]
00b6b6cc	b.ne 0x00b6b88c
00b6b6d0	mov x11,xzr
00b6b6d4	cmp x25,#0x10
00b6b6d8	add x10,x19,x27
00b6b6dc	b.cc 0x00b6b6f4
00b6b6e0	ldr q0,[x10]
00b6b6e4	ldr q1,[x22]
00b6b6e8	mov w11,#0x10
00b6b6ec	eor v0.16B,v1.16B,v0.16B
00b6b6f0	str q0,[x10]
00b6b6f4	cmp x11,x25
00b6b6f8	b.cs 0x00b6b788
00b6b6fc	mvn x8,x21
00b6b700	sub x9,x27,#0x11
00b6b704	cmp x9,x8
00b6b708	mvn x12,x11
00b6b70c	csinv x13,x9,x21,cs
00b6b710	sub x12,x12,x13
00b6b714	cmp x12,#0x20
00b6b718	b.cc 0x00b6b750
00b6b71c	orr x13,x11,x27
00b6b720	cmp x9,x8
00b6b724	add x14,x19,x13
00b6b728	add x15,x22,x25
00b6b72c	csinv x13,x9,x21,cs
00b6b730	cmp x14,x15
00b6b734	b.cs 0x00b6b65c
00b6b738	ldr x14,[sp, #0x8]
00b6b73c	sub x13,x27,x13
00b6b740	add x13,x14,x13
00b6b744	add x14,x22,x11
00b6b748	cmp x14,x13
00b6b74c	b.cs 0x00b6b65c
00b6b750	mov x13,x11
00b6b754	cmp x8,x9
00b6b758	csel x8,x8,x9,hi
00b6b75c	add x11,x13,x27
00b6b760	mvn x8,x8
00b6b764	add x10,x22,x13
00b6b768	sub x8,x8,x13
00b6b76c	add x9,x19,x11
00b6b770	ldrb w11,[x9]
00b6b774	ldrb w12,[x10], #0x1
00b6b778	subs x8,x8,#0x1
00b6b77c	eor w11,w12,w11
00b6b780	strb w11,[x9], #0x1
00b6b784	b.ne 0x00b6b770
00b6b788	add x8,x25,x27
00b6b78c	cmp x8,#0x10
00b6b790	b.eq 0x00b6b7a4
00b6b794	ldr x8,[x19, #0x38]
00b6b798	ldr x9,[x19, #0x20]
00b6b79c	cmp x8,x9
00b6b7a0	b.ne 0x00b6b7c4
00b6b7a4	mov w2,#0x10
00b6b7a8	add x4,sp,#0x38
00b6b7ac	mov x0,x23
00b6b7b0	mov x1,x19
00b6b7b4	mov x3,x19
00b6b7b8	bl 0x00c42180
00b6b7bc	mov w26,w0
00b6b7c0	cbnz w0,0x00b6bc60
00b6b7c4	ldr x1,[sp, #0x18]
00b6b7c8	mov w2,#0x10
00b6b7cc	add x3,sp,#0x48
00b6b7d0	add x4,sp,#0x40
00b6b7d4	mov x0,x23
00b6b7d8	stp xzr,xzr,[sp, #0x48]
00b6b7dc	str xzr,[sp, #0x40]
00b6b7e0	bl 0x00c42180
00b6b7e4	mov w26,w0
00b6b7e8	cbnz w0,0x00b6bc44
00b6b7ec	add x8,sp,#0x48
00b6b7f0	mov x11,xzr
00b6b7f4	cmp x25,#0x10
00b6b7f8	add x10,x8,x27
00b6b7fc	b.cc 0x00b6b814
00b6b800	ldr q0,[x22]
00b6b804	ldr q1,[x10]
00b6b808	mov w11,#0x10
00b6b80c	eor v0.16B,v1.16B,v0.16B
00b6b810	str q0,[x20]
00b6b814	cmp x11,x25
00b6b818	b.cs 0x00b6b87c
00b6b81c	mvn x8,x21
00b6b820	sub x9,x27,#0x11
00b6b824	cmp x9,x8
00b6b828	mvn x12,x11
00b6b82c	csinv x13,x9,x21,cs
00b6b830	sub x12,x12,x13
00b6b834	cmp x12,#0x20
00b6b838	b.cs 0x00b6b9c0
00b6b83c	mov x13,x11
00b6b840	cmp x8,x9
00b6b844	csel x9,x8,x9,hi
00b6b848	add x11,x13,x27
00b6b84c	add x8,sp,#0x48
00b6b850	mvn x9,x9
00b6b854	add x10,x20,x13
00b6b858	add x8,x8,x11
00b6b85c	sub x9,x9,x13
00b6b860	add x11,x22,x13
00b6b864	ldrb w12,[x11], #0x1
00b6b868	ldrb w13,[x8], #0x1
00b6b86c	subs x9,x9,#0x1
00b6b870	eor w12,w13,w12
00b6b874	strb w12,[x10], #0x1
00b6b878	b.ne 0x00b6b864
00b6b87c	add x0,sp,#0x48
00b6b880	mov w1,#0x10
00b6b884	bl 0x00c42220
00b6b888	ldr w8,[x19, #0x44]
00b6b88c	orr w8,w8,#0x2
00b6b890	cmp w8,#0x2
00b6b894	b.ne 0x00b6b9b0
00b6b898	ldr x1,[sp, #0x18]
00b6b89c	mov w2,#0x10
00b6b8a0	add x3,sp,#0x48
00b6b8a4	add x4,sp,#0x40
00b6b8a8	mov x0,x23
00b6b8ac	stp xzr,xzr,[sp, #0x48]
00b6b8b0	str xzr,[sp, #0x40]
00b6b8b4	bl 0x00c42180
00b6b8b8	mov w26,w0
00b6b8bc	cbnz w0,0x00b6bc44
00b6b8c0	add x8,sp,#0x48
00b6b8c4	mov x11,xzr
00b6b8c8	cmp x25,#0x10
00b6b8cc	add x10,x8,x27
00b6b8d0	b.cc 0x00b6b8e8
00b6b8d4	ldr q0,[x22]
00b6b8d8	ldr q1,[x10]
00b6b8dc	mov w11,#0x10
00b6b8e0	eor v0.16B,v1.16B,v0.16B
00b6b8e4	str q0,[sp, #0x20]
00b6b8e8	cmp x11,x25
00b6b8ec	b.cs 0x00b6b950
00b6b8f0	mvn x8,x21
00b6b8f4	sub x9,x27,#0x11
00b6b8f8	cmp x9,x8
00b6b8fc	mvn x12,x11
00b6b900	csinv x13,x9,x21,cs
00b6b904	sub x12,x12,x13
00b6b908	cmp x12,#0x20
00b6b90c	b.cs 0x00b6ba68
00b6b910	mov x13,x11
00b6b914	cmp x8,x9
00b6b918	csel x9,x8,x9,hi
00b6b91c	add x11,x13,x27
00b6b920	add x8,sp,#0x48
00b6b924	mvn x9,x9
00b6b928	add x10,x28,x13
00b6b92c	add x8,x8,x11
00b6b930	sub x9,x9,x13
00b6b934	add x11,x22,x13
00b6b938	ldrb w12,[x11], #0x1
00b6b93c	ldrb w13,[x8], #0x1
00b6b940	subs x9,x9,#0x1
00b6b944	eor w12,w13,w12
00b6b948	strb w12,[x10], #0x1
00b6b94c	b.ne 0x00b6b938
00b6b950	add x0,sp,#0x48
00b6b954	mov w1,#0x10
00b6b958	bl 0x00c42220
00b6b95c	mov x11,xzr
00b6b960	cmp x25,#0x10
00b6b964	add x8,x19,x27
00b6b968	b.cc 0x00b6b980
00b6b96c	ldr q0,[x8]
00b6b970	ldr q1,[sp, #0x20]
00b6b974	mov w11,#0x10
00b6b978	eor v0.16B,v1.16B,v0.16B
00b6b97c	str q0,[x8]
00b6b980	cmp x11,x25
00b6b984	b.cs 0x00b6bb84
00b6b988	mvn x9,x21
00b6b98c	sub x10,x27,#0x11
00b6b990	cmp x10,x9
00b6b994	mvn x12,x11
00b6b998	csinv x13,x10,x21,cs
00b6b99c	sub x13,x12,x13
00b6b9a0	cmp x13,#0x20
00b6b9a4	b.cs 0x00b6bb10
00b6b9a8	mov x12,x11
00b6b9ac	b 0x00b6bb50
00b6b9b0	add x27,x25,x27
00b6b9b4	cmp x27,#0x10
00b6b9b8	b.ne 0x00b6bbd8
00b6b9bc	b 0x00b6bbe8
00b6b9c0	add x13,x20,x11
00b6b9c4	add x16,x22,x25
00b6b9c8	orr x17,x11,x27
00b6b9cc	cmp x9,x8
00b6b9d0	add x18,sp,#0x48
00b6b9d4	add x14,x20,x25
00b6b9d8	add x15,x22,x11
00b6b9dc	add x17,x18,x17
00b6b9e0	csinv x18,x9,x21,cs
00b6b9e4	cmp x13,x16
00b6b9e8	sub x16,x27,x18
00b6b9ec	cset w18,cc
00b6b9f0	cmp x15,x14
00b6b9f4	ldr x15,[sp, #0x10]
00b6b9f8	add x15,x15,x16
00b6b9fc	cset w16,cc
00b6ba00	cmp x13,x15
00b6ba04	cset w13,cc
00b6ba08	cmp x17,x14
00b6ba0c	and w16,w18,w16
00b6ba10	cset w14,cc
00b6ba14	tbnz w16,#0x0,0x00b6b83c
00b6ba18	and w13,w13,w14
00b6ba1c	tbnz w13,#0x0,0x00b6b83c
00b6ba20	and x14,x12,#-0x20
00b6ba24	mov x15,xzr
00b6ba28	orr x13,x11,x14
00b6ba2c	orr x16,x11,x15
00b6ba30	add x17,x22,x16
00b6ba34	add x18,x10,x16
00b6ba38	ldp q0,q1,[x17]
00b6ba3c	ldp q2,q3,[x18]
00b6ba40	add x15,x15,#0x20
00b6ba44	add x16,x20,x16
00b6ba48	cmp x14,x15
00b6ba4c	eor v0.16B,v2.16B,v0.16B
00b6ba50	eor v1.16B,v3.16B,v1.16B
00b6ba54	stp q0,q1,[x16]
00b6ba58	b.ne 0x00b6ba2c
00b6ba5c	cmp x12,x14
00b6ba60	b.ne 0x00b6b840
00b6ba64	b 0x00b6b87c
00b6ba68	add x13,x28,x11
00b6ba6c	add x16,x22,x25
00b6ba70	orr x17,x11,x27
00b6ba74	cmp x9,x8
00b6ba78	add x18,sp,#0x48
00b6ba7c	add x14,x28,x25
00b6ba80	add x15,x22,x11
00b6ba84	add x17,x18,x17
00b6ba88	csinv x18,x9,x21,cs
00b6ba8c	cmp x13,x16
00b6ba90	sub x16,x27,x18
00b6ba94	cset w18,cc
00b6ba98	cmp x15,x14
00b6ba9c	ldr x15,[sp, #0x10]
00b6baa0	add x15,x15,x16
00b6baa4	cset w16,cc
00b6baa8	cmp x13,x15
00b6baac	cset w13,cc
00b6bab0	cmp x17,x14
00b6bab4	and w16,w18,w16
00b6bab8	cset w14,cc
00b6babc	tbnz w16,#0x0,0x00b6b910
00b6bac0	and w13,w13,w14
00b6bac4	tbnz w13,#0x0,0x00b6b910
00b6bac8	and x14,x12,#-0x20
00b6bacc	mov x15,xzr
00b6bad0	orr x13,x11,x14
00b6bad4	orr x16,x11,x15
00b6bad8	add x17,x22,x16
00b6badc	add x18,x10,x16
00b6bae0	ldp q0,q1,[x17]
00b6bae4	ldp q2,q3,[x18]
00b6bae8	add x15,x15,#0x20
00b6baec	add x16,x28,x16
00b6baf0	cmp x14,x15
00b6baf4	eor v0.16B,v2.16B,v0.16B
00b6baf8	eor v1.16B,v3.16B,v1.16B
00b6bafc	stp q0,q1,[x16]
00b6bb00	b.ne 0x00b6bad4
00b6bb04	cmp x12,x14
00b6bb08	b.ne 0x00b6b914
00b6bb0c	b 0x00b6b950
00b6bb10	and x14,x13,#-0x20
00b6bb14	mov x15,xzr
00b6bb18	orr x12,x11,x14
00b6bb1c	orr x16,x11,x15
00b6bb20	add x17,x8,x16
00b6bb24	add x16,x28,x16
00b6bb28	ldp q0,q1,[x17]
00b6bb2c	ldp q2,q3,[x16]
00b6bb30	add x15,x15,#0x20
00b6bb34	cmp x14,x15
00b6bb38	eor v0.16B,v2.16B,v0.16B
00b6bb3c	eor v1.16B,v3.16B,v1.16B
00b6bb40	stp q0,q1,[x17]
00b6bb44	b.ne 0x00b6bb1c
00b6bb48	cmp x13,x14
00b6bb4c	b.eq 0x00b6bb84
00b6bb50	cmp x9,x10
00b6bb54	csel x9,x9,x10,hi
00b6bb58	add x11,x12,x27
00b6bb5c	mvn x9,x9
00b6bb60	add x8,x28,x12
00b6bb64	sub x9,x9,x12
00b6bb68	add x10,x19,x11
00b6bb6c	ldrb w11,[x10]
00b6bb70	ldrb w12,[x8], #0x1
00b6bb74	subs x9,x9,#0x1
00b6bb78	eor w11,w12,w11
00b6bb7c	strb w11,[x10], #0x1
00b6bb80	b.ne 0x00b6bb6c
00b6bb84	add x1,sp,#0x20
00b6bb88	mov x0,x20
00b6bb8c	mov x2,x25
00b6bb90	bl 0x00c2ffd0
00b6bb94	add x27,x25,x27
00b6bb98	cmp x27,#0x10
00b6bb9c	b.eq 0x00b6bbb0
00b6bba0	ldr x8,[x19, #0x38]
00b6bba4	ldr x9,[x19, #0x20]
00b6bba8	cmp x8,x9
00b6bbac	b.ne 0x00b6bbd8
00b6bbb0	mov w2,#0x10
00b6bbb4	add x4,sp,#0x38
00b6bbb8	mov x0,x23
00b6bbbc	mov x1,x19
00b6bbc0	mov x3,x19
00b6bbc4	bl 0x00c42180
00b6bbc8	mov w26,w0
00b6bbcc	cbnz w0,0x00b6bc60
00b6bbd0	cmp x27,#0x10
00b6bbd4	b.eq 0x00b6bbe8
00b6bbd8	ldr x8,[x19, #0x38]
00b6bbdc	ldr x9,[x19, #0x20]
00b6bbe0	cmp x8,x9
00b6bbe4	b.ne 0x00b6bc24
00b6bbe8	ldr w8,[x19, #0x40]
00b6bbec	cbz w8,0x00b6bc24
00b6bbf0	mov w8,wzr
00b6bbf4	sub x9,x24,w8, SXTW 
00b6bbf8	add x9,x19,x9
00b6bbfc	ldrb w10,[x9, #0x10]
00b6bc00	add w10,w10,#0x1
00b6bc04	tst w10,#0xff
00b6bc08	strb w10,[x9, #0x10]
00b6bc0c	b.ne 0x00b6bc24
00b6bc10	ldr w9,[x19, #0x40]
00b6bc14	add w8,w8,#0x1
00b6bc18	and w8,w8,#0xff
00b6bc1c	cmp w9,w8
00b6bc20	b.hi 0x00b6bbf4
00b6bc24	subs x21,x21,x25
00b6bc28	add x22,x22,x25
00b6bc2c	add x20,x20,x25
00b6bc30	b.ne 0x00b6b6a0
00b6bc34	mov w26,wzr
00b6bc38	b 0x00b6bc6c
00b6bc3c	mov w26,wzr
00b6bc40	b 0x00b6bc70
00b6bc44	ldr w8,[x19, #0xa8]
00b6bc48	add x0,sp,#0x48
00b6bc4c	mov w1,#0x10
00b6bc50	orr w8,w8,#0x10
00b6bc54	str w8,[x19, #0xa8]
00b6bc58	bl 0x00c42220
00b6bc5c	b 0x00b6bc6c
00b6bc60	ldr w8,[x19, #0xa8]
00b6bc64	orr w8,w8,#0x10
00b6bc68	str w8,[x19, #0xa8]
00b6bc6c	ldr x23,[sp]
00b6bc70	add x0,sp,#0x20
00b6bc74	mov w1,#0x10
00b6bc78	bl 0x00c42220
00b6bc7c	ldr x8,[x23, #0x28]
00b6bc80	ldr x9,[sp, #0x58]
00b6bc84	cmp x8,x9
00b6bc88	b.ne 0x00b6bcb0
00b6bc8c	mov w0,w26
00b6bc90	ldp x29,x30,[sp, #0xb0]
00b6bc94	ldp x20,x19,[sp, #0xa0]
00b6bc98	ldp x22,x21,[sp, #0x90]
00b6bc9c	ldp x24,x23,[sp, #0x80]
00b6bca0	ldp x26,x25,[sp, #0x70]
00b6bca4	ldp x28,x27,[sp, #0x60]
00b6bca8	add sp,sp,#0xc0
00b6bcac	ret
00b6bcb0	bl 0x00c2fec0
