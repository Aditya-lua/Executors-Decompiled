; std::__ndk1::ctype_byname<wchar_t>::do_is @ 00bfd7d0
00bfd7d0	paciasp
00bfd7d4	stp x29,x30,[sp, #-0x40]!
00bfd7d8	stp x24,x23,[sp, #0x10]
00bfd7dc	stp x22,x21,[sp, #0x20]
00bfd7e0	stp x20,x19,[sp, #0x30]
00bfd7e4	mov x29,sp
00bfd7e8	mov x19,x1
00bfd7ec	cmp x1,x2
00bfd7f0	b.eq 0x00bfd94c
00bfd7f4	mov x20,x3
00bfd7f8	mov x21,x2
00bfd7fc	mov x22,x0
00bfd800	adrp x24,0x78a000
00bfd804	add x24,x24,#0x8e8
00bfd808	b 0x00bfd824
00bfd80c	ldr x8,[x24, x23, LSL #0x3]
00bfd810	str x8,[x20]
00bfd814	add x19,x19,#0x4
00bfd818	add x20,x20,#0x8
00bfd81c	cmp x19,x21
00bfd820	b.eq 0x00bfd94c
00bfd824	ldr w23,[x19]
00bfd828	cmp w23,#0x7f
00bfd82c	b.ls 0x00bfd80c
00bfd830	ldr x1,[x22, #0x10]
00bfd834	mov w0,w23
00bfd838	str xzr,[x20]
00bfd83c	bl 0x00c43a90
00bfd840	cbz w0,0x00bfd850
00bfd844	ldr x8,[x20]
00bfd848	orr x8,x8,#0x1
00bfd84c	str x8,[x20]
00bfd850	ldr x1,[x22, #0x10]
00bfd854	mov w0,w23
00bfd858	bl 0x00c43ab0
00bfd85c	cbz w0,0x00bfd86c
00bfd860	ldr x8,[x20]
00bfd864	orr x8,x8,#0x2
00bfd868	str x8,[x20]
00bfd86c	ldr x1,[x22, #0x10]
00bfd870	mov w0,w23
00bfd874	bl 0x00c43860
00bfd878	cbz w0,0x00bfd888
00bfd87c	ldr x8,[x20]
00bfd880	orr x8,x8,#0x4
00bfd884	str x8,[x20]
00bfd888	ldr x1,[x22, #0x10]
00bfd88c	mov w0,w23
00bfd890	bl 0x00c43a00
00bfd894	cbz w0,0x00bfd8a4
00bfd898	ldr x8,[x20]
00bfd89c	orr x8,x8,#0x8
00bfd8a0	str x8,[x20]
00bfd8a4	ldr x1,[x22, #0x10]
00bfd8a8	mov w0,w23
00bfd8ac	bl 0x00c437d0
00bfd8b0	cbz w0,0x00bfd8c0
00bfd8b4	ldr x8,[x20]
00bfd8b8	orr x8,x8,#0x10
00bfd8bc	str x8,[x20]
00bfd8c0	ldr x1,[x22, #0x10]
00bfd8c4	mov w0,w23
00bfd8c8	bl 0x00c43ac0
00bfd8cc	cbz w0,0x00bfd8dc
00bfd8d0	ldr x8,[x20]
00bfd8d4	orr x8,x8,#0x20
00bfd8d8	str x8,[x20]
00bfd8dc	ldr x1,[x22, #0x10]
00bfd8e0	mov w0,w23
00bfd8e4	bl 0x00c439b0
00bfd8e8	cbz w0,0x00bfd8f8
00bfd8ec	ldr x8,[x20]
00bfd8f0	orr x8,x8,#0x40
00bfd8f4	str x8,[x20]
00bfd8f8	ldr x1,[x22, #0x10]
00bfd8fc	mov w0,w23
00bfd900	bl 0x00c43870
00bfd904	cbz w0,0x00bfd914
00bfd908	ldr x8,[x20]
00bfd90c	orr x8,x8,#0x80
00bfd910	str x8,[x20]
00bfd914	ldr x1,[x22, #0x10]
00bfd918	mov w0,w23
00bfd91c	bl 0x00c43ba0
00bfd920	cbz w0,0x00bfd930
00bfd924	ldr x8,[x20]
00bfd928	orr x8,x8,#0x100
00bfd92c	str x8,[x20]
00bfd930	ldr x1,[x22, #0x10]
00bfd934	mov w0,w23
00bfd938	bl 0x00c43a10
00bfd93c	cbz w0,0x00bfd814
00bfd940	ldr x8,[x20]
00bfd944	orr x8,x8,#0x200
00bfd948	b 0x00bfd810
00bfd94c	mov x0,x19
00bfd950	ldp x20,x19,[sp, #0x30]
00bfd954	ldp x22,x21,[sp, #0x20]
00bfd958	ldp x24,x23,[sp, #0x10]
00bfd95c	ldp x29,x30,[sp], #0x40
00bfd960	autiasp
00bfd964	ret
