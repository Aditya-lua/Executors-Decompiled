; ossl_x448_derive_public_key @ 00a49770
00a49770	str x28,[sp, #-0x40]!
00a49774	stp x22,x21,[sp, #0x10]
00a49778	stp x20,x19,[sp, #0x20]
00a4977c	stp x29,x30,[sp, #0x30]
00a49780	add x29,sp,#0x30
00a49784	sub sp,sp,#0x300
00a49788	ldr q0,[x1]
00a4978c	mov x19,x0
00a49790	add x0,sp,#0x108
00a49794	orr w2,wzr,#0x38
00a49798	str q0,[sp, #0x140]
00a4979c	ldr x8,[x1, #0x30]
00a497a0	str x8,[sp, #0x170]
00a497a4	ldr q0,[x1, #0x20]
00a497a8	ldrb w8,[sp, #0x140]
00a497ac	str q0,[sp, #0x160]
00a497b0	and w8,w8,#0xfc
00a497b4	ldr q0,[x1, #0x10]
00a497b8	strb w8,[sp, #0x140]
00a497bc	ldrb w8,[sp, #0x177]
00a497c0	add x1,sp,#0x140
00a497c4	str q0,[sp, #0x150]
00a497c8	orr w8,w8,#0x80
00a497cc	strb w8,[sp, #0x177]
00a497d0	bl 0x00c3a610
00a497d4	add x0,sp,#0x108
00a497d8	add x1,sp,#0x108
00a497dc	bl 0x00c3a640
00a497e0	adrp x8,0xcb5000
00a497e4	ldr x8,[x8, #0x528]
00a497e8	mov x0,sp
00a497ec	add x2,sp,#0x108
00a497f0	ldr x1,[x8]
00a497f4	bl 0x00a47c54
00a497f8	add x0,sp,#0x180
00a497fc	mov x1,sp
00a49800	mov w2,#0x100
00a49804	add x22,sp,#0x180
00a49808	bl 0x00c2ffd0
00a4980c	sub x0,x29,#0x70
00a49810	add x1,sp,#0x180
00a49814	add x20,x22,#0xc0
00a49818	bl 0x00c3a4d0
00a4981c	sub x0,x29,#0xb0
00a49820	sub x1,x29,#0x70
00a49824	bl 0x00c3a5c0
00a49828	sub x0,x29,#0x70
00a4982c	sub x1,x29,#0xb0
00a49830	bl 0x00c3a4d0
00a49834	sub x0,x29,#0xb0
00a49838	sub x1,x29,#0x70
00a4983c	add x2,sp,#0x180
00a49840	bl 0x00c3a4b0
00a49844	ldp q1,q0,[x29, #-0x90]
00a49848	ldp q3,q2,[x29, #-0xb0]
00a4984c	add x21,x22,#0x80
00a49850	add x22,x22,#0x40
00a49854	mov x0,x21
00a49858	mov x1,x20
00a4985c	mov x2,x22
00a49860	stp q1,q0,[sp, #0x260]
00a49864	stp q3,q2,[sp, #0x240]
00a49868	bl 0x00c3a4b0
00a4986c	mov x0,x22
00a49870	mov x1,x21
00a49874	bl 0x00c3a4d0
00a49878	mov w2,#0x1
00a4987c	mov x0,x19
00a49880	mov x1,x22
00a49884	bl 0x00c3a5e0
00a49888	add x0,sp,#0x180
00a4988c	mov w1,#0x100
00a49890	bl 0x00c34750
00a49894	mov x0,sp
00a49898	mov w1,#0x100
00a4989c	bl 0x00c34750
00a498a0	add sp,sp,#0x300
00a498a4	ldp x29,x30,[sp, #0x30]
00a498a8	ldp x20,x19,[sp, #0x20]
00a498ac	ldp x22,x21,[sp, #0x10]
00a498b0	ldr x28,[sp], #0x40
00a498b4	ret
