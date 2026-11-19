; BIO_gets @ 009fc7a0
009fc7a0	str x21,[sp, #-0x30]!
009fc7a4	stp x20,x19,[sp, #0x10]
009fc7a8	mov w19,w2
009fc7ac	stp x29,x30,[sp, #0x20]
009fc7b0	add x29,sp,#0x20
009fc7b4	str xzr,[sp, #0x8]
009fc7b8	cbz x0,0x009fc838
009fc7bc	ldr x8,[x0, #0x8]
009fc7c0	mov x21,x0
009fc7c4	cbz x8,0x009fc804
009fc7c8	ldr x8,[x8, #0x38]
009fc7cc	cbz x8,0x009fc804
009fc7d0	tbnz w19,#0x1f,0x009fc880
009fc7d4	ldp x9,x8,[x21, #0x10]
009fc7d8	mov x20,x1
009fc7dc	cbz x9,0x009fc8a8
009fc7e0	cbnz x8,0x009fc8ac
009fc7e4	mov w1,#0x5
009fc7e8	mov w5,#0x1
009fc7ec	mov x0,x21
009fc7f0	mov x2,x20
009fc7f4	mov w3,w19
009fc7f8	mov x4,xzr
009fc7fc	blr x9
009fc800	b 0x009fc8d0
009fc804	bl 0x00c342a0
009fc808	adrp x0,0x2b2000
009fc80c	adrp x2,0x2b7000
009fc810	add x0,x0,#0x42
009fc814	add x2,x2,#0x8f9
009fc818	mov w1,#0x1cc
009fc81c	bl 0x00c342b0
009fc820	mov w0,#0x20
009fc824	mov w1,#0x79
009fc828	mov x2,xzr
009fc82c	bl 0x00c342c0
009fc830	orr w6,wzr,#0xfffffffe
009fc834	b 0x009fc86c
009fc838	bl 0x00c342a0
009fc83c	adrp x0,0x2b2000
009fc840	adrp x2,0x2b7000
009fc844	add x0,x0,#0x42
009fc848	add x2,x2,#0x8f9
009fc84c	mov w1,#0x1c8
009fc850	bl 0x00c342b0
009fc854	mov w1,#0x102
009fc858	mov w0,#0x20
009fc85c	movk w1,#0xc, LSL #16
009fc860	mov x2,xzr
009fc864	bl 0x00c342c0
009fc868	mov w6,#0xffffffff
009fc86c	ldp x29,x30,[sp, #0x20]
009fc870	ldp x20,x19,[sp, #0x10]
009fc874	mov w0,w6
009fc878	ldr x21,[sp], #0x30
009fc87c	ret
009fc880	bl 0x00c342a0
009fc884	adrp x0,0x2b2000
009fc888	adrp x2,0x2b7000
009fc88c	add x0,x0,#0x42
009fc890	add x2,x2,#0x8f9
009fc894	mov w1,#0x1d1
009fc898	bl 0x00c342b0
009fc89c	mov w0,#0x20
009fc8a0	mov w1,#0x7d
009fc8a4	b 0x009fc860
009fc8a8	cbz x8,0x009fc8dc
009fc8ac	sxtw x3,w19
009fc8b0	mov w1,#0x5
009fc8b4	mov w6,#0x1
009fc8b8	mov x0,x21
009fc8bc	mov x2,x20
009fc8c0	mov w4,wzr
009fc8c4	mov x5,xzr
009fc8c8	mov x7,xzr
009fc8cc	blr x8
009fc8d0	mov x6,x0
009fc8d4	cmp w6,#0x1
009fc8d8	b.lt 0x009fc86c
009fc8dc	ldr w8,[x21, #0x28]
009fc8e0	cbz w8,0x009fc964
009fc8e4	ldr x8,[x21, #0x8]
009fc8e8	mov x0,x21
009fc8ec	mov x1,x20
009fc8f0	mov w2,w19
009fc8f4	ldr x8,[x8, #0x38]
009fc8f8	blr x8
009fc8fc	mov w6,w0
009fc900	cmp w0,#0x1
009fc904	b.lt 0x009fc98c
009fc908	sxtw x9,w6
009fc90c	mov w6,#0x1
009fc910	str x9,[sp, #0x8]
009fc914	ldp x10,x8,[x21, #0x10]
009fc918	cbz x10,0x009fc998
009fc91c	cbnz x8,0x009fc99c
009fc920	sxtw x8,w6
009fc924	cmp w6,#0x0
009fc928	csel x5,x9,x8,gt
009fc92c	mov w1,#0x85
009fc930	mov x0,x21
009fc934	mov x2,x20
009fc938	mov w3,w19
009fc93c	mov x4,xzr
009fc940	blr x10
009fc944	mov x6,x0
009fc948	cmp x0,#0x1
009fc94c	b.lt 0x009fc9c0
009fc950	str x6,[sp, #0x8]
009fc954	mov w6,#0x1
009fc958	cmp w6,#0x1
009fc95c	b.ge 0x009fc9c8
009fc960	b 0x009fc86c
009fc964	bl 0x00c342a0
009fc968	adrp x0,0x2b2000
009fc96c	adrp x2,0x2b7000
009fc970	add x0,x0,#0x42
009fc974	add x2,x2,#0x8f9
009fc978	mov w1,#0x1dc
009fc97c	bl 0x00c342b0
009fc980	mov w0,#0x20
009fc984	orr w1,wzr,#0x78
009fc988	b 0x009fc860
009fc98c	mov x9,xzr
009fc990	ldp x10,x8,[x21, #0x10]
009fc994	cbnz x10,0x009fc91c
009fc998	cbz x8,0x009fc9c0
009fc99c	sxtw x3,w19
009fc9a0	mov w1,#0x85
009fc9a4	add x7,sp,#0x8
009fc9a8	mov x0,x21
009fc9ac	mov x2,x20
009fc9b0	mov w4,wzr
009fc9b4	mov x5,xzr
009fc9b8	blr x8
009fc9bc	mov x6,x0
009fc9c0	cmp w6,#0x1
009fc9c4	b.lt 0x009fc86c
009fc9c8	ldr x8,[sp, #0x8]
009fc9cc	cmp x8,w19, SXTW 
009fc9d0	csinv w6,w8,wzr,ls
009fc9d4	b 0x009fc86c
