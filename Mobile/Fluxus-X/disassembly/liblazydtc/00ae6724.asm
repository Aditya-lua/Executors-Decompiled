; FUN_00ae6724 @ 00ae6724
00ae6724	sub sp,sp,#0x60
00ae6728	stp x22,x21,[sp, #0x30]
00ae672c	mov x22,x0
00ae6730	mov x0,x2
00ae6734	stp x24,x23,[sp, #0x20]
00ae6738	stp x20,x19,[sp, #0x40]
00ae673c	stp x29,x30,[sp, #0x50]
00ae6740	add x29,sp,#0x50
00ae6744	mov x19,x4
00ae6748	mov x23,x3
00ae674c	mov x20,x2
00ae6750	mov x21,x1
00ae6754	bl 0x00c322f0
00ae6758	add w8,w0,#0x7
00ae675c	adrp x1,0x2d1000
00ae6760	add w9,w0,#0xe
00ae6764	cmp w8,#0x0
00ae6768	add x1,x1,#0x42e
00ae676c	mov x0,x23
00ae6770	mov x2,x19
00ae6774	csel w24,w9,w8,lt
00ae6778	bl 0x00c357f0
00ae677c	cbz x0,0x00ae67dc
00ae6780	mov x19,x0
00ae6784	cmp x22,x20
00ae6788	b.eq 0x00ae679c
00ae678c	mov x0,x22
00ae6790	mov x1,x20
00ae6794	bl 0x00c369c0
00ae6798	tbz w0,#0x1f,0x00ae67b4
00ae679c	cmp x21,x20
00ae67a0	b.eq 0x00ae67fc
00ae67a4	mov x0,x21
00ae67a8	mov x1,x20
00ae67ac	bl 0x00c369c0
00ae67b0	tbnz w0,#0x1f,0x00ae67fc
00ae67b4	mov x20,xzr
00ae67b8	mov x21,xzr
00ae67bc	mov x0,x19
00ae67c0	bl 0x00c35800
00ae67c4	adrp x1,0x2bc000
00ae67c8	add x1,x1,#0x428
00ae67cc	mov w2,#0x33
00ae67d0	mov x0,x20
00ae67d4	bl 0x00c32310
00ae67d8	b 0x00ae67e0
00ae67dc	mov x21,xzr
00ae67e0	mov x0,x21
00ae67e4	ldp x29,x30,[sp, #0x50]
00ae67e8	ldp x20,x19,[sp, #0x40]
00ae67ec	ldp x22,x21,[sp, #0x30]
00ae67f0	ldp x24,x23,[sp, #0x20]
00ae67f4	add sp,sp,#0x60
00ae67f8	ret
00ae67fc	asr w24,w24,#0x3
00ae6800	lsl w8,w24,#0x1
00ae6804	sxtw x23,w8
00ae6808	adrp x1,0x2bc000
00ae680c	add x1,x1,#0x428
00ae6810	mov w2,#0x2a
00ae6814	mov x0,x23
00ae6818	bl 0x00c32320
00ae681c	mov x20,x0
00ae6820	cbz x0,0x00ae67b8
00ae6824	mov x0,x22
00ae6828	mov x1,x20
00ae682c	mov w2,w24
00ae6830	bl 0x00c38c70
00ae6834	tbnz w0,#0x1f,0x00ae67b8
00ae6838	add x1,x20,w24, SXTW 
00ae683c	mov x0,x21
00ae6840	mov w2,w24
00ae6844	bl 0x00c38c70
00ae6848	tbnz w0,#0x1f,0x00ae67b8
00ae684c	add x2,sp,#0xc
00ae6850	mov x0,x20
00ae6854	mov x1,x23
00ae6858	mov x3,xzr
00ae685c	mov x4,x19
00ae6860	mov x5,xzr
00ae6864	bl 0x00c370c0
00ae6868	cbz w0,0x00ae67b8
00ae686c	add x0,sp,#0xc
00ae6870	mov w1,#0x14
00ae6874	mov x2,xzr
00ae6878	bl 0x00c36970
00ae687c	mov x21,x0
00ae6880	b 0x00ae67bc
