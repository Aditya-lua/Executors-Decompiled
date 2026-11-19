; psa_its_get_info @ 00ba27f0
00ba27f0	sub sp,sp,#0x30
00ba27f4	stp x20,x19,[sp, #0x10]
00ba27f8	stp x29,x30,[sp, #0x20]
00ba27fc	add x29,sp,#0x20
00ba2800	mrs x20,tpidr_el0
00ba2804	ldr x8,[x20, #0x28]
00ba2808	mov x2,sp
00ba280c	str x8,[sp, #0x8]
00ba2810	str xzr,[sp]
00ba2814	bl 0x00ba2854
00ba2818	ldr x8,[sp]
00ba281c	mov w19,w0
00ba2820	cbz x8,0x00ba282c
00ba2824	mov x0,x8
00ba2828	bl 0x00c30be0
00ba282c	ldr x8,[x20, #0x28]
00ba2830	ldr x9,[sp, #0x8]
00ba2834	cmp x8,x9
00ba2838	b.ne 0x00ba2850
00ba283c	mov w0,w19
00ba2840	ldp x29,x30,[sp, #0x20]
00ba2844	ldp x20,x19,[sp, #0x10]
00ba2848	add sp,sp,#0x30
00ba284c	ret
00ba2850	bl 0x00c2fec0
