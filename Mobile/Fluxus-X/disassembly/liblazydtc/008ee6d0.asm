; cpr::Session::SetMultipart @ 008ee6d0
008ee6d0	stp x28,x27,[sp, #-0x60]!
008ee6d4	stp x26,x25,[sp, #0x10]
008ee6d8	stp x24,x23,[sp, #0x20]
008ee6dc	stp x22,x21,[sp, #0x30]
008ee6e0	stp x20,x19,[sp, #0x40]
008ee6e4	stp x29,x30,[sp, #0x50]
008ee6e8	add x29,sp,#0x50
008ee6ec	ldr x8,[x0, #0x18]
008ee6f0	mov x19,x0
008ee6f4	mov x20,x1
008ee6f8	ldr x0,[x8, #0x18]
008ee6fc	cbz x0,0x008ee708
008ee700	bl 0x00c31030
008ee704	ldr x8,[x19, #0x18]
008ee708	ldr x0,[x8]
008ee70c	bl 0x00c31810
008ee710	ldr x8,[x19, #0x18]
008ee714	str x0,[x8, #0x18]
008ee718	ldp x22,x23,[x20]
008ee71c	cmp x22,x23
008ee720	b.eq 0x008ee8f4
008ee724	ldrb w8,[x22, #0x58]
008ee728	cbz w8,0x008ee81c
008ee72c	add x20,x22,#0x60
008ee730	mov x0,x20
008ee734	bl 0x00c31080
008ee738	mov x21,x0
008ee73c	mov x0,x20
008ee740	bl 0x00c31070
008ee744	cmp x21,x0
008ee748	b.eq 0x008ee8dc
008ee74c	mov x20,x0
008ee750	add x24,x22,#0x30
008ee754	add x25,x22,#0x31
008ee758	add x26,x22,#0x1
008ee75c	add x27,x21,#0x19
008ee760	ldr x8,[x19, #0x18]
008ee764	ldr x0,[x8, #0x18]
008ee768	bl 0x00c317d0
008ee76c	ldrb w8,[x24]
008ee770	mov x21,x0
008ee774	tbnz w8,#0x0,0x008ee798
008ee778	lsr w9,w8,#0x1
008ee77c	cbz x9,0x008ee7a0
008ee780	mov x1,x25
008ee784	tbz w8,#0x0,0x008ee78c
008ee788	ldr x1,[x22, #0x40]
008ee78c	mov x0,x21
008ee790	bl 0x00c31830
008ee794	b 0x008ee7a0
008ee798	ldr x9,[x22, #0x38]
008ee79c	cbnz x9,0x008ee780
008ee7a0	mov x28,x27
008ee7a4	ldrb w8,[x28, #-0x19]!
008ee7a8	tbnz w8,#0x0,0x008ee7b4
008ee7ac	sub x1,x27,#0x18
008ee7b0	b 0x008ee7b8
008ee7b4	ldur x1,[x27, #-0x9]
008ee7b8	mov x0,x21
008ee7bc	bl 0x00c317f0
008ee7c0	ldrb w8,[x22]
008ee7c4	mov x1,x26
008ee7c8	tbz w8,#0x0,0x008ee7d0
008ee7cc	ldr x1,[x22, #0x10]
008ee7d0	mov x0,x21
008ee7d4	bl 0x00c31820
008ee7d8	ldrb w8,[x28, #0x18]
008ee7dc	tbnz w8,#0x0,0x008ee800
008ee7e0	lsr w9,w8,#0x1
008ee7e4	cbz x9,0x008ee808
008ee7e8	mov x1,x27
008ee7ec	tbz w8,#0x0,0x008ee7f4
008ee7f0	ldur x1,[x27, #0xf]
008ee7f4	mov x0,x21
008ee7f8	bl 0x00c31800
008ee7fc	b 0x008ee808
008ee800	ldur x9,[x27, #0x7]
008ee804	cbnz x9,0x008ee7e8
008ee808	add x8,x28,#0x30
008ee80c	cmp x8,x20
008ee810	add x27,x27,#0x30
008ee814	b.ne 0x008ee760
008ee818	b 0x008ee8dc
008ee81c	ldr x8,[x19, #0x18]
008ee820	ldr x0,[x8, #0x18]
008ee824	bl 0x00c317d0
008ee828	mov x8,x22
008ee82c	ldrb w9,[x8, #0x30]!
008ee830	mov x20,x0
008ee834	tbnz w9,#0x0,0x008ee84c
008ee838	lsr w10,w9,#0x1
008ee83c	cbz x10,0x008ee864
008ee840	tbnz w9,#0x0,0x008ee858
008ee844	add x1,x8,#0x1
008ee848	b 0x008ee85c
008ee84c	ldr x10,[x22, #0x38]
008ee850	cbnz x10,0x008ee840
008ee854	b 0x008ee864
008ee858	ldr x1,[x22, #0x40]
008ee85c	mov x0,x20
008ee860	bl 0x00c31830
008ee864	ldrb w8,[x22]
008ee868	ldrb w21,[x22, #0x59]
008ee86c	tbnz w8,#0x0,0x008ee878
008ee870	add x1,x22,#0x1
008ee874	b 0x008ee87c
008ee878	ldr x1,[x22, #0x10]
008ee87c	mov x0,x20
008ee880	bl 0x00c31820
008ee884	cbz w21,0x008ee8a8
008ee888	ldp x1,x2,[x22, #0x48]
008ee88c	mov x0,x20
008ee890	bl 0x00c317e0
008ee894	mov x8,x22
008ee898	ldrb w9,[x8, #0x18]!
008ee89c	tbnz w9,#0x0,0x008ee8bc
008ee8a0	add x1,x8,#0x1
008ee8a4	b 0x008ee8c0
008ee8a8	mov x8,x22
008ee8ac	ldrb w9,[x8, #0x18]!
008ee8b0	tbnz w9,#0x0,0x008ee8cc
008ee8b4	add x1,x8,#0x1
008ee8b8	b 0x008ee8d0
008ee8bc	ldr x1,[x22, #0x28]
008ee8c0	mov x0,x20
008ee8c4	bl 0x00c31800
008ee8c8	b 0x008ee8dc
008ee8cc	ldr x1,[x22, #0x28]
008ee8d0	mov x2,#-0x1
008ee8d4	mov x0,x20
008ee8d8	bl 0x00c317e0
008ee8dc	add x22,x22,#0x78
008ee8e0	cmp x22,x23
008ee8e4	b.ne 0x008ee724
008ee8e8	ldr x8,[x19, #0x18]
008ee8ec	ldr x2,[x8, #0x18]
008ee8f0	b 0x008ee8f8
008ee8f4	mov x2,x0
008ee8f8	ldr x0,[x8]
008ee8fc	mov w1,#0x281d
008ee900	bl 0x00c317c0
008ee904	mov w8,#0x1
008ee908	strb w8,[x19, #0x10]
008ee90c	ldp x29,x30,[sp, #0x50]
008ee910	ldp x20,x19,[sp, #0x40]
008ee914	ldp x22,x21,[sp, #0x30]
008ee918	ldp x24,x23,[sp, #0x20]
008ee91c	ldp x26,x25,[sp, #0x10]
008ee920	ldp x28,x27,[sp], #0x60
008ee924	ret
