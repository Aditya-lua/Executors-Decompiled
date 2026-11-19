; mbedtls_rsa_deduce_primes @ 00baa758
00baa758	sub sp,sp,#0x90
00baa75c	str x27,[sp, #0x30]
00baa760	stp x26,x25,[sp, #0x40]
00baa764	stp x24,x23,[sp, #0x50]
00baa768	stp x22,x21,[sp, #0x60]
00baa76c	stp x20,x19,[sp, #0x70]
00baa770	stp x29,x30,[sp, #0x80]
00baa774	add x29,sp,#0x80
00baa778	mrs x25,tpidr_el0
00baa77c	ldr x8,[x25, #0x28]
00baa780	mov x20,x4
00baa784	mov x19,x3
00baa788	mov x24,x2
00baa78c	mov x23,x1
00baa790	mov x21,x0
00baa794	orr w22,wzr,#0xfffffffc
00baa798	str x8,[sp, #0x28]
00baa79c	cbz x3,0x00baa7b8
00baa7a0	cbz x20,0x00baa7b8
00baa7a4	ldr x8,[x19]
00baa7a8	cbnz x8,0x00baa7b4
00baa7ac	ldr x8,[x20]
00baa7b0	cbz x8,0x00baa7ec
00baa7b4	orr w22,wzr,#0xfffffffc
00baa7b8	ldr x8,[x25, #0x28]
00baa7bc	ldr x9,[sp, #0x28]
00baa7c0	cmp x8,x9
00baa7c4	b.ne 0x00baaa40
00baa7c8	mov w0,w22
00baa7cc	ldp x29,x30,[sp, #0x80]
00baa7d0	ldp x20,x19,[sp, #0x70]
00baa7d4	ldp x22,x21,[sp, #0x60]
00baa7d8	ldp x24,x23,[sp, #0x50]
00baa7dc	ldp x26,x25,[sp, #0x40]
00baa7e0	ldr x27,[sp, #0x30]
00baa7e4	add sp,sp,#0x90
00baa7e8	ret
00baa7ec	mov x0,x21
00baa7f0	mov x1,xzr
00baa7f4	bl 0x00c41b40
00baa7f8	cmp w0,#0x1
00baa7fc	b.lt 0x00baa7b4
00baa800	mov w1,#0x1
00baa804	mov x0,x24
00baa808	bl 0x00c41b40
00baa80c	cmp w0,#0x1
00baa810	b.lt 0x00baa7b4
00baa814	mov x0,x24
00baa818	mov x1,x21
00baa81c	bl 0x00c41b50
00baa820	tbz w0,#0x1f,0x00baa7b4
00baa824	mov w1,#0x1
00baa828	mov x0,x23
00baa82c	bl 0x00c41b40
00baa830	cmp w0,#0x1
00baa834	b.lt 0x00baa7b4
00baa838	mov x0,x23
00baa83c	mov x1,x21
00baa840	bl 0x00c41b50
00baa844	tbz w0,#0x1f,0x00baa7b4
00baa848	add x0,sp,#0x8
00baa84c	bl 0x00c41c00
00baa850	add x0,sp,#0x18
00baa854	bl 0x00c41c00
00baa858	add x0,sp,#0x18
00baa85c	mov x1,x24
00baa860	mov x2,x23
00baa864	bl 0x00c41c80
00baa868	mov w22,w0
00baa86c	cbnz w0,0x00baa888
00baa870	add x0,sp,#0x18
00baa874	add x1,sp,#0x18
00baa878	mov w2,#0x1
00baa87c	bl 0x00c41d50
00baa880	mov w22,w0
00baa884	cbz w0,0x00baa89c
00baa888	add x0,sp,#0x8
00baa88c	bl 0x00c41bb0
00baa890	add x0,sp,#0x18
00baa894	bl 0x00c41bb0
00baa898	b 0x00baa7b8
00baa89c	add x0,sp,#0x18
00baa8a0	bl 0x00c41c30
00baa8a4	ands w23,w0,#0xffff
00baa8a8	b.eq 0x00baaa1c
00baa8ac	and x1,x0,#0xffff
00baa8b0	add x0,sp,#0x18
00baa8b4	bl 0x00c41d10
00baa8b8	mov w22,w0
00baa8bc	cbnz w0,0x00baa888
00baa8c0	ldr x8,[x21]
00baa8c4	adrp x26,0x788000
00baa8c8	add x26,x26,#0x3a1
00baa8cc	ldr x8,[x8]
00baa8d0	and x8,x8,#0x7
00baa8d4	cmp x8,#0x1
00baa8d8	cset w24,eq
00baa8dc	ldrb w1,[x26, x24]
00baa8e0	add x0,sp,#0x8
00baa8e4	bl 0x00c41c40
00baa8e8	mov w22,w0
00baa8ec	cbnz w0,0x00baa888
00baa8f0	add x1,sp,#0x8
00baa8f4	mov x0,x19
00baa8f8	mov x2,x21
00baa8fc	bl 0x00c41bc0
00baa900	mov w22,w0
00baa904	cbnz w0,0x00baa888
00baa908	mov w1,#0x1
00baa90c	mov x0,x19
00baa910	bl 0x00c41b40
00baa914	cbz w0,0x00baa92c
00baa918	add x24,x24,#0x1
00baa91c	cmp x24,#0x36
00baa920	orr w22,wzr,#0xfffffffc
00baa924	b.cc 0x00baa8dc
00baa928	b 0x00baa888
00baa92c	add x0,sp,#0x8
00baa930	add x1,sp,#0x8
00baa934	add x2,sp,#0x18
00baa938	mov x3,x21
00baa93c	mov x4,x20
00baa940	bl 0x00c41b80
00baa944	mov w22,w0
00baa948	cbnz w0,0x00baa888
00baa94c	mov w27,#0x1
00baa950	add x0,sp,#0x8
00baa954	mov w1,#0x1
00baa958	bl 0x00c41b40
00baa95c	cbz w0,0x00baaa0c
00baa960	add x0,sp,#0x8
00baa964	add x1,sp,#0x8
00baa968	mov w2,#0x1
00baa96c	bl 0x00c41b10
00baa970	mov w22,w0
00baa974	cbnz w0,0x00baa888
00baa978	add x1,sp,#0x8
00baa97c	mov x0,x19
00baa980	mov x2,x21
00baa984	bl 0x00c41bc0
00baa988	mov w22,w0
00baa98c	cbnz w0,0x00baa888
00baa990	mov w1,#0x1
00baa994	mov x0,x19
00baa998	bl 0x00c41b40
00baa99c	cmp w0,#0x1
00baa9a0	b.ne 0x00baa9b8
00baa9a4	mov x0,x19
00baa9a8	mov x1,x21
00baa9ac	bl 0x00c41b50
00baa9b0	cmn w0,#0x1
00baa9b4	b.eq 0x00baaa24
00baa9b8	add x0,sp,#0x8
00baa9bc	add x1,sp,#0x8
00baa9c0	mov w2,#0x1
00baa9c4	bl 0x00c41d50
00baa9c8	mov w22,w0
00baa9cc	cbnz w0,0x00baa888
00baa9d0	add x0,sp,#0x8
00baa9d4	add x1,sp,#0x8
00baa9d8	add x2,sp,#0x8
00baa9dc	bl 0x00c41c80
00baa9e0	mov w22,w0
00baa9e4	cbnz w0,0x00baa888
00baa9e8	add x0,sp,#0x8
00baa9ec	add x1,sp,#0x8
00baa9f0	mov x2,x21
00baa9f4	bl 0x00c41c60
00baa9f8	mov w22,w0
00baa9fc	cbnz w0,0x00baa888
00baaa00	add w27,w27,#0x1
00baaa04	cmp w23,w27, UXTH 
00baaa08	b.cs 0x00baa950
00baaa0c	add x0,sp,#0x8
00baaa10	mov w1,#0x1
00baaa14	bl 0x00c41b40
00baaa18	cbz w0,0x00baa918
00baaa1c	orr w22,wzr,#0xfffffffc
00baaa20	b 0x00baa888
00baaa24	mov x0,x20
00baaa28	mov x1,xzr
00baaa2c	mov x2,x21
00baaa30	mov x3,x19
00baaa34	bl 0x00c41b70
00baaa38	mov w22,w0
00baaa3c	b 0x00baa888
00baaa40	bl 0x00c2fec0
