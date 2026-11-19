; mbedtls_poly1305_mac @ 00b7b754
00b7b754	sub sp,sp,#0xa0
00b7b758	stp x24,x23,[sp, #0x60]
00b7b75c	stp x22,x21,[sp, #0x70]
00b7b760	stp x20,x19,[sp, #0x80]
00b7b764	stp x29,x30,[sp, #0x90]
00b7b768	add x29,sp,#0x90
00b7b76c	mrs x23,tpidr_el0
00b7b770	ldr x8,[x23, #0x28]
00b7b774	mov x21,x1
00b7b778	mov x22,x0
00b7b77c	mov x0,sp
00b7b780	mov w1,#0x50
00b7b784	mov x19,x3
00b7b788	mov x20,x2
00b7b78c	stur x8,[x29, #-0x38]
00b7b790	mov x24,sp
00b7b794	bl 0x00c42220
00b7b798	adrp x8,0x29c000
00b7b79c	ldr q0,[x22]
00b7b7a0	ldr q1,[x8, #0x170]
00b7b7a4	mov w1,#0x10
00b7b7a8	and v0.16B,v0.16B,v1.16B
00b7b7ac	str q0,[sp]
00b7b7b0	ldr q0,[x22, #0x10]
00b7b7b4	add x22,x24,#0x34
00b7b7b8	mov x0,x22
00b7b7bc	stp xzr,xzr,[sp, #0x20]
00b7b7c0	str q0,[sp, #0x10]
00b7b7c4	str wzr,[sp, #0x30]
00b7b7c8	bl 0x00c42220
00b7b7cc	str xzr,[sp, #0x48]
00b7b7d0	cbz x20,0x00b7b81c
00b7b7d4	cmp x20,#0x10
00b7b7d8	b.cc 0x00b7b804
00b7b7dc	lsr x1,x20,#0x4
00b7b7e0	mov x0,sp
00b7b7e4	mov w3,#0x1
00b7b7e8	mov x2,x21
00b7b7ec	bl 0x00b7b534
00b7b7f0	ands x9,x20,#0xf
00b7b7f4	b.eq 0x00b7b81c
00b7b7f8	and x8,x20,#-0x10
00b7b7fc	mov x20,x9
00b7b800	b 0x00b7b808
00b7b804	mov x8,xzr
00b7b808	add x1,x21,x8
00b7b80c	mov x0,x22
00b7b810	mov x2,x20
00b7b814	str x20,[sp, #0x48]
00b7b818	bl 0x00c2ffd0
00b7b81c	mov x0,sp
00b7b820	mov x1,x19
00b7b824	bl 0x00c42250
00b7b828	mov x0,sp
00b7b82c	mov w1,#0x50
00b7b830	bl 0x00c42220
00b7b834	ldr x8,[x23, #0x28]
00b7b838	ldur x9,[x29, #-0x38]
00b7b83c	cmp x8,x9
00b7b840	b.ne 0x00b7b860
00b7b844	ldp x29,x30,[sp, #0x90]
00b7b848	ldp x20,x19,[sp, #0x80]
00b7b84c	ldp x22,x21,[sp, #0x70]
00b7b850	ldp x24,x23,[sp, #0x60]
00b7b854	mov w0,wzr
00b7b858	add sp,sp,#0xa0
00b7b85c	ret
00b7b860	bl 0x00c2fec0
