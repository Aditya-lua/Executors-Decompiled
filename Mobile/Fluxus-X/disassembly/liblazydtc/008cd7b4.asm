; FUN_008cd7b4 @ 008cd7b4
008cd7b4	sub sp,sp,#0x50
008cd7b8	stp x29,x30,[sp, #0x10]
008cd7bc	str x23,[sp, #0x20]
008cd7c0	stp x22,x21,[sp, #0x30]
008cd7c4	stp x20,x19,[sp, #0x40]
008cd7c8	add x29,sp,#0x10
008cd7cc	mrs x23,tpidr_el0
008cd7d0	mov x20,x2
008cd7d4	mov x21,x1
008cd7d8	ldr x8,[x23, #0x28]
008cd7dc	mov x19,x0
008cd7e0	str x8,[sp, #0x8]
008cd7e4	ldr w8,[x3, #0xc]
008cd7e8	cmp w8,#0x3
008cd7ec	b.eq 0x008cd820
008cd7f0	mov x22,x3
008cd7f4	cmp w8,#0x5
008cd7f8	b.ne 0x008cd8b8
008cd7fc	ldr x8,[x22]
008cd800	mov x1,sp
008cd804	add x0,x8,#0x18
008cd808	bl 0x008b93c8
008cd80c	cbz w0,0x008cd8b8
008cd810	ldr d0,[sp]
008cd814	mov w8,#0x3
008cd818	str w8,[x22, #0xc]
008cd81c	str d0,[x22]
008cd820	ldr w8,[x21, #0xc]
008cd824	cmp w8,#0x3
008cd828	b.eq 0x008cd858
008cd82c	cmp w8,#0x5
008cd830	b.ne 0x008cd8dc
008cd834	ldr x8,[x21]
008cd838	mov x1,sp
008cd83c	add x0,x8,#0x18
008cd840	bl 0x008b93c8
008cd844	cbz w0,0x008cd8dc
008cd848	ldr d0,[sp]
008cd84c	mov w8,#0x3
008cd850	str w8,[x21, #0xc]
008cd854	str d0,[x21]
008cd858	ldr w8,[x20, #0xc]
008cd85c	cmp w8,#0x3
008cd860	b.eq 0x008cd890
008cd864	cmp w8,#0x5
008cd868	b.ne 0x008cd900
008cd86c	ldr x8,[x20]
008cd870	mov x1,sp
008cd874	add x0,x8,#0x18
008cd878	bl 0x008b93c8
008cd87c	cbz w0,0x008cd900
008cd880	ldr d0,[sp]
008cd884	mov w8,#0x3
008cd888	str w8,[x20, #0xc]
008cd88c	str d0,[x20]
008cd890	ldr x8,[x23, #0x28]
008cd894	ldr x9,[sp, #0x8]
008cd898	cmp x8,x9
008cd89c	b.ne 0x008cd924
008cd8a0	ldp x20,x19,[sp, #0x40]
008cd8a4	ldr x23,[sp, #0x20]
008cd8a8	ldp x22,x21,[sp, #0x30]
008cd8ac	ldp x29,x30,[sp, #0x10]
008cd8b0	add sp,sp,#0x50
008cd8b4	ret
008cd8b8	ldr x8,[x23, #0x28]
008cd8bc	ldr x9,[sp, #0x8]
008cd8c0	cmp x8,x9
008cd8c4	b.ne 0x008cd924
008cd8c8	adrp x2,0x2cc000
008cd8cc	add x2,x2,#0xc33
008cd8d0	mov x0,x19
008cd8d4	mov x1,x22
008cd8d8	bl 0x008b3a88
008cd8dc	ldr x8,[x23, #0x28]
008cd8e0	ldr x9,[sp, #0x8]
008cd8e4	cmp x8,x9
008cd8e8	b.ne 0x008cd924
008cd8ec	adrp x2,0x2b6000
008cd8f0	add x2,x2,#0xdfd
008cd8f4	mov x0,x19
008cd8f8	mov x1,x21
008cd8fc	bl 0x008b3a88
008cd900	ldr x8,[x23, #0x28]
008cd904	ldr x9,[sp, #0x8]
008cd908	cmp x8,x9
008cd90c	b.ne 0x008cd924
008cd910	adrp x2,0x2a7000
008cd914	add x2,x2,#0x1f5
008cd918	mov x0,x19
008cd91c	mov x1,x20
008cd920	bl 0x008b3a88
008cd924	bl 0x00c2fec0
