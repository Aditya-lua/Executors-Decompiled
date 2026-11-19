; mbedtls_camellia_crypt_cbc @ 00b72760
00b72760	sub sp,sp,#0x70
00b72764	stp x26,x25,[sp, #0x20]
00b72768	stp x24,x23,[sp, #0x30]
00b7276c	stp x22,x21,[sp, #0x40]
00b72770	stp x20,x19,[sp, #0x50]
00b72774	stp x29,x30,[sp, #0x60]
00b72778	add x29,sp,#0x60
00b7277c	mrs x25,tpidr_el0
00b72780	ldr x8,[x25, #0x28]
00b72784	mov x23,x5
00b72788	mov x19,x4
00b7278c	mov x20,x3
00b72790	mov x21,x2
00b72794	mov w24,w1
00b72798	mov x22,x0
00b7279c	cmp w1,#0x1
00b727a0	str x8,[sp, #0x18]
00b727a4	b.ls 0x00b727b0
00b727a8	mov w0,#0xffffffdc
00b727ac	b 0x00b72850
00b727b0	tst x21,#0xf
00b727b4	b.eq 0x00b727c0
00b727b8	mov w0,#0xffffffda
00b727bc	b 0x00b72850
00b727c0	cbz w24,0x00b72808
00b727c4	cbz x21,0x00b7284c
00b727c8	mov x26,x23
00b727cc	ldr q0,[x19], #0x10
00b727d0	ldr q1,[x20]
00b727d4	mov x0,x22
00b727d8	mov w1,w24
00b727dc	mov x2,x23
00b727e0	eor v0.16B,v1.16B,v0.16B
00b727e4	mov x3,x23
00b727e8	str q0,[x26], #0x10
00b727ec	bl 0x00c41f80
00b727f0	ldr q0,[x23]
00b727f4	subs x21,x21,#0x10
00b727f8	mov x23,x26
00b727fc	str q0,[x20]
00b72800	b.ne 0x00b727cc
00b72804	b 0x00b7284c
00b72808	cbz x21,0x00b7284c
00b7280c	ldr q0,[x19]
00b72810	mov x0,x22
00b72814	mov w1,wzr
00b72818	mov x2,x19
00b7281c	mov x3,x23
00b72820	str q0,[sp]
00b72824	bl 0x00c41f80
00b72828	ldr q0,[x23]
00b7282c	ldr q1,[x20]
00b72830	subs x21,x21,#0x10
00b72834	add x19,x19,#0x10
00b72838	eor v0.16B,v1.16B,v0.16B
00b7283c	str q0,[x23], #0x10
00b72840	ldr q0,[sp]
00b72844	str q0,[x20]
00b72848	b.ne 0x00b7280c
00b7284c	mov w0,wzr
00b72850	ldr x8,[x25, #0x28]
00b72854	ldr x9,[sp, #0x18]
00b72858	cmp x8,x9
00b7285c	b.ne 0x00b7287c
00b72860	ldp x29,x30,[sp, #0x60]
00b72864	ldp x20,x19,[sp, #0x50]
00b72868	ldp x22,x21,[sp, #0x40]
00b7286c	ldp x24,x23,[sp, #0x30]
00b72870	ldp x26,x25,[sp, #0x20]
00b72874	add sp,sp,#0x70
00b72878	ret
00b7287c	bl 0x00c2fec0
