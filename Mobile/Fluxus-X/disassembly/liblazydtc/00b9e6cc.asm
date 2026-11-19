; mbedtls_cipher_cmac_update @ 00b9e6cc
00b9e6cc	sub sp,sp,#0x80
00b9e6d0	stp x28,x27,[sp, #0x20]
00b9e6d4	stp x26,x25,[sp, #0x30]
00b9e6d8	stp x24,x23,[sp, #0x40]
00b9e6dc	stp x22,x21,[sp, #0x50]
00b9e6e0	stp x20,x19,[sp, #0x60]
00b9e6e4	stp x29,x30,[sp, #0x70]
00b9e6e8	add x29,sp,#0x70
00b9e6ec	mrs x25,tpidr_el0
00b9e6f0	ldr x8,[x25, #0x28]
00b9e6f4	mov x19,x2
00b9e6f8	mov x21,x1
00b9e6fc	mov x22,x0
00b9e700	str x8,[sp, #0x18]
00b9e704	cbz x0,0x00b9e98c
00b9e708	mov w0,#0xffff9f00
00b9e70c	cbz x21,0x00b9e990
00b9e710	ldr x8,[x22]
00b9e714	cbz x8,0x00b9e990
00b9e718	ldr x20,[x22, #0x58]
00b9e71c	cbz x20,0x00b9e98c
00b9e720	ldr w9,[x8, #0x8]
00b9e724	ldr x8,[x20, #0x20]
00b9e728	and x23,x9,#0x1f
00b9e72c	cbz x8,0x00b9e838
00b9e730	sub x2,x23,x8
00b9e734	cmp x2,x19
00b9e738	b.cs 0x00b9e838
00b9e73c	add x8,x20,x8
00b9e740	add x0,x8,#0x10
00b9e744	mov x1,x21
00b9e748	bl 0x00c2ffd0
00b9e74c	cmp w23,#0x8
00b9e750	mov x8,xzr
00b9e754	b.cc 0x00b9e798
00b9e758	add x9,x23,#0x1
00b9e75c	cmp x9,#0x10
00b9e760	mov w9,#0x10
00b9e764	mov x8,xzr
00b9e768	csinc x9,x9,x23,ls
00b9e76c	add x10,x20,x8
00b9e770	ldr x11,[x10, #0x10]
00b9e774	ldr x12,[x10]
00b9e778	add x13,x8,#0x10
00b9e77c	add x8,x8,#0x8
00b9e780	cmp x13,x23
00b9e784	eor x11,x12,x11
00b9e788	str x11,[x10]
00b9e78c	b.ls 0x00b9e76c
00b9e790	sub x8,x9,#0x1
00b9e794	and x8,x8,#-0x8
00b9e798	cmp x8,x23
00b9e79c	b.cs 0x00b9e808
00b9e7a0	sub x9,x23,x8
00b9e7a4	cmp x9,#0x1f
00b9e7a8	b.ls 0x00b9e7e8
00b9e7ac	and x10,x9,#-0x20
00b9e7b0	add x11,x20,x8
00b9e7b4	add x8,x8,x10
00b9e7b8	add x11,x11,#0x10
00b9e7bc	mov x12,x10
00b9e7c0	ldp q0,q1,[x11, #-0x10]
00b9e7c4	ldr q2,[x11, #0x10]
00b9e7c8	subs x12,x12,#0x20
00b9e7cc	eor v0.16B,v0.16B,v1.16B
00b9e7d0	eor v1.16B,v1.16B,v2.16B
00b9e7d4	stp q0,q1,[x11, #-0x10]
00b9e7d8	add x11,x11,#0x20
00b9e7dc	b.ne 0x00b9e7c0
00b9e7e0	cmp x9,x10
00b9e7e4	b.eq 0x00b9e808
00b9e7e8	add x9,x20,x8
00b9e7ec	sub x8,x23,x8
00b9e7f0	ldrb w10,[x9, #0x10]
00b9e7f4	ldrb w11,[x9]
00b9e7f8	subs x8,x8,#0x1
00b9e7fc	eor w10,w11,w10
00b9e800	strb w10,[x9], #0x1
00b9e804	b.ne 0x00b9e7f0
00b9e808	add x4,sp,#0x10
00b9e80c	mov x0,x22
00b9e810	mov x1,x20
00b9e814	mov x2,x23
00b9e818	mov x3,x20
00b9e81c	bl 0x00c42180
00b9e820	cbnz w0,0x00b9e990
00b9e824	ldr x8,[x20, #0x20]
00b9e828	str xzr,[x20, #0x20]
00b9e82c	sub x8,x23,x8
00b9e830	add x21,x21,x8
00b9e834	sub x19,x19,x8
00b9e838	add x8,x23,x19
00b9e83c	sub x8,x8,#0x1
00b9e840	udiv x26,x8,x23
00b9e844	cmp x26,#0x2
00b9e848	b.cc 0x00b9e9c0
00b9e84c	add x8,x23,#0x1
00b9e850	mov w9,#0x10
00b9e854	cmp x8,#0x10
00b9e858	csinc x8,x9,x23,ls
00b9e85c	sub x8,x8,#0x1
00b9e860	mov x27,xzr
00b9e864	add x10,x20,x23
00b9e868	and x8,x8,#-0x8
00b9e86c	mov w28,#0x1
00b9e870	mov x24,x21
00b9e874	stp x10,x8,[sp]
00b9e878	cmp w23,#0x8
00b9e87c	mov x10,xzr
00b9e880	b.cc 0x00b9e8b0
00b9e884	mov x8,xzr
00b9e888	ldr x9,[x24, x8#0x0]
00b9e88c	ldr x10,[x20, x8#0x0]
00b9e890	add x11,x8,#0x10
00b9e894	cmp x11,x23
00b9e898	eor x9,x10,x9
00b9e89c	add x10,x8,#0x8
00b9e8a0	str x9,[x20, x8#0x0]
00b9e8a4	mov x8,x10
00b9e8a8	b.ls 0x00b9e888
00b9e8ac	ldr x10,[sp, #0x8]
00b9e8b0	cmp x10,x23
00b9e8b4	b.cs 0x00b9e910
00b9e8b8	sub x9,x23,x10
00b9e8bc	cmp x9,#0x1f
00b9e8c0	b.ls 0x00b9e8f0
00b9e8c4	mul x8,x27,x23
00b9e8c8	add x11,x8,x23
00b9e8cc	add x11,x21,x11
00b9e8d0	add x12,x20,x10
00b9e8d4	cmp x12,x11
00b9e8d8	b.cs 0x00b9e948
00b9e8dc	ldr x11,[sp]
00b9e8e0	add x8,x21,x8
00b9e8e4	add x8,x8,x10
00b9e8e8	cmp x8,x11
00b9e8ec	b.cs 0x00b9e948
00b9e8f0	mov x8,x10
00b9e8f4	ldrb w9,[x24, x8]
00b9e8f8	ldrb w10,[x20, x8]
00b9e8fc	eor w9,w10,w9
00b9e900	strb w9,[x20, x8]
00b9e904	add x8,x8,#0x1
00b9e908	cmp x23,x8
00b9e90c	b.ne 0x00b9e8f4
00b9e910	add x4,sp,#0x10
00b9e914	mov x0,x22
00b9e918	mov x1,x20
00b9e91c	mov x2,x23
00b9e920	mov x3,x20
00b9e924	bl 0x00c42180
00b9e928	cbnz w0,0x00b9e990
00b9e92c	add x28,x28,#0x1
00b9e930	sub x19,x19,x23
00b9e934	add x24,x24,x23
00b9e938	cmp x28,x26
00b9e93c	add x27,x27,#0x1
00b9e940	b.cc 0x00b9e878
00b9e944	b 0x00b9e9c4
00b9e948	and x11,x9,#-0x20
00b9e94c	add x8,x10,x11
00b9e950	add x10,x10,#0x10
00b9e954	mov x12,x11
00b9e958	add x13,x24,x10
00b9e95c	add x14,x20,x10
00b9e960	ldp q0,q1,[x13, #-0x10]
00b9e964	ldp q2,q3,[x14, #-0x10]
00b9e968	subs x12,x12,#0x20
00b9e96c	add x10,x10,#0x20
00b9e970	eor v0.16B,v2.16B,v0.16B
00b9e974	eor v1.16B,v3.16B,v1.16B
00b9e978	stp q0,q1,[x14, #-0x10]
00b9e97c	b.ne 0x00b9e958
00b9e980	cmp x9,x11
00b9e984	b.ne 0x00b9e8f4
00b9e988	b 0x00b9e910
00b9e98c	mov w0,#0xffff9f00
00b9e990	ldr x8,[x25, #0x28]
00b9e994	ldr x9,[sp, #0x18]
00b9e998	cmp x8,x9
00b9e99c	b.ne 0x00b9e9fc
00b9e9a0	ldp x29,x30,[sp, #0x70]
00b9e9a4	ldp x20,x19,[sp, #0x60]
00b9e9a8	ldp x22,x21,[sp, #0x50]
00b9e9ac	ldp x24,x23,[sp, #0x40]
00b9e9b0	ldp x26,x25,[sp, #0x30]
00b9e9b4	ldp x28,x27,[sp, #0x20]
00b9e9b8	add sp,sp,#0x80
00b9e9bc	ret
00b9e9c0	mov x24,x21
00b9e9c4	cbz x19,0x00b9e9f4
00b9e9c8	ldr x8,[x20, #0x20]
00b9e9cc	mov x1,x24
00b9e9d0	mov x2,x19
00b9e9d4	add x8,x20,x8
00b9e9d8	add x0,x8,#0x10
00b9e9dc	bl 0x00c2ffd0
00b9e9e0	ldr x8,[x20, #0x20]
00b9e9e4	mov w0,wzr
00b9e9e8	add x8,x8,x19
00b9e9ec	str x8,[x20, #0x20]
00b9e9f0	b 0x00b9e990
00b9e9f4	mov w0,wzr
00b9e9f8	b 0x00b9e990
00b9e9fc	bl 0x00c2fec0
