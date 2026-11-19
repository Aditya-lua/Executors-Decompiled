; PKCS12_pbe_crypt_ex @ 00abb5a4
00abb5a4	str x27,[sp, #-0x60]!
00abb5a8	stp x26,x25,[sp, #0x10]
00abb5ac	stp x24,x23,[sp, #0x20]
00abb5b0	stp x22,x21,[sp, #0x30]
00abb5b4	stp x20,x19,[sp, #0x40]
00abb5b8	stp x29,x30,[sp, #0x50]
00abb5bc	add x29,sp,#0x50
00abb5c0	mov w23,w7
00abb5c4	mov x21,x6
00abb5c8	mov x20,x5
00abb5cc	mov w24,w4
00abb5d0	mov x25,x3
00abb5d4	mov w22,w2
00abb5d8	mov x26,x1
00abb5dc	mov x27,x0
00abb5e0	bl 0x00c34b90
00abb5e4	mov x19,x0
00abb5e8	str wzr,[sp, #0x8]
00abb5ec	cbz x0,0x00abb700
00abb5f0	ldp x6,x7,[x29, #0x10]
00abb5f4	ldp x0,x3,[x27]
00abb5f8	mov x1,x26
00abb5fc	mov w2,w22
00abb600	mov x4,x19
00abb604	mov w5,w23
00abb608	bl 0x00c3d060
00abb60c	cbz w0,0x00abb734
00abb610	mov x0,x19
00abb614	bl 0x00c36d40
00abb618	add w23,w0,w24
00abb61c	mov x0,x19
00abb620	bl 0x00c34b80
00abb624	bl 0x00c35280
00abb628	tbz w0,#0x19,0x00abb658
00abb62c	mov w1,#0x16
00abb630	add x3,sp,#0x8
00abb634	mov x0,x19
00abb638	mov w2,wzr
00abb63c	bl 0x00c361b0
00abb640	tbnz w0,#0x1f,0x00abb798
00abb644	mov x0,x19
00abb648	bl 0x00c3cec0
00abb64c	ldr w2,[sp, #0x8]
00abb650	cbz w0,0x00abb804
00abb654	add w23,w2,w23
00abb658	adrp x1,0x2d2000
00abb65c	sxtw x0,w23
00abb660	add x1,x1,#0x244
00abb664	mov w2,#0x46
00abb668	bl 0x00c32320
00abb66c	mov x23,x0
00abb670	cbz x0,0x00abb760
00abb674	add x2,sp,#0xc
00abb678	mov x0,x19
00abb67c	mov x1,x23
00abb680	mov x3,x25
00abb684	mov w4,w24
00abb688	bl 0x00c36d70
00abb68c	cbz w0,0x00abb7c4
00abb690	ldrsw x24,[sp, #0xc]
00abb694	add x2,sp,#0xc
00abb698	mov x0,x19
00abb69c	add x1,x23,x24
00abb6a0	bl 0x00c36e20
00abb6a4	cbz w0,0x00abb834
00abb6a8	ldrsw x8,[sp, #0xc]
00abb6ac	mov x0,x19
00abb6b0	add x22,x8,x24
00abb6b4	bl 0x00c34b80
00abb6b8	bl 0x00c35280
00abb6bc	tbz w0,#0x19,0x00abb6ec
00abb6c0	mov x0,x19
00abb6c4	bl 0x00c3cec0
00abb6c8	cbz w0,0x00abb6ec
00abb6cc	ldr w2,[sp, #0x8]
00abb6d0	add x3,x23,x22
00abb6d4	mov w1,#0x10
00abb6d8	mov x0,x19
00abb6dc	bl 0x00c361b0
00abb6e0	tbnz w0,#0x1f,0x00abb8bc
00abb6e4	ldr w8,[sp, #0x8]
00abb6e8	add w22,w8,w22
00abb6ec	cbz x21,0x00abb6f4
00abb6f0	str w22,[x21]
00abb6f4	cbz x20,0x00abb738
00abb6f8	str x23,[x20]
00abb6fc	b 0x00abb738
00abb700	bl 0x00c342a0
00abb704	adrp x0,0x2d2000
00abb708	adrp x2,0x2be000
00abb70c	add x0,x0,#0x244
00abb710	add x2,x2,#0x206
00abb714	orr w1,wzr,#0x1f
00abb718	bl 0x00c342b0
00abb71c	mov w8,#0x103
00abb720	movk w8,#0xc, LSL #16
00abb724	sub w1,w8,#0x3
00abb728	mov w0,#0x23
00abb72c	mov x2,xzr
00abb730	bl 0x00c342c0
00abb734	mov x23,xzr
00abb738	mov x0,x19
00abb73c	bl 0x00c342d0
00abb740	mov x0,x23
00abb744	ldp x29,x30,[sp, #0x50]
00abb748	ldp x20,x19,[sp, #0x40]
00abb74c	ldp x22,x21,[sp, #0x30]
00abb750	ldp x24,x23,[sp, #0x20]
00abb754	ldp x26,x25,[sp, #0x10]
00abb758	ldr x27,[sp], #0x60
00abb75c	ret
00abb760	bl 0x00c342a0
00abb764	adrp x0,0x2d2000
00abb768	adrp x2,0x2be000
00abb76c	add x0,x0,#0x244
00abb770	add x2,x2,#0x206
00abb774	mov w1,#0x47
00abb778	bl 0x00c342b0
00abb77c	mov w8,#0x103
00abb780	movk w8,#0xc, LSL #16
00abb784	sub w1,w8,#0x3
00abb788	mov w0,#0x23
00abb78c	mov x2,xzr
00abb790	bl 0x00c342c0
00abb794	b 0x00abb738
00abb798	bl 0x00c342a0
00abb79c	adrp x0,0x2d2000
00abb7a0	adrp x2,0x2be000
00abb7a4	add x0,x0,#0x244
00abb7a8	add x2,x2,#0x206
00abb7ac	mov w1,#0x32
00abb7b0	bl 0x00c342b0
00abb7b4	mov w1,#0x103
00abb7b8	mov w0,#0x23
00abb7bc	movk w1,#0xc, LSL #16
00abb7c0	b 0x00abb72c
00abb7c4	adrp x20,0x2d2000
00abb7c8	add x20,x20,#0x244
00abb7cc	mov w2,#0x4c
00abb7d0	mov x0,x23
00abb7d4	mov x1,x20
00abb7d8	bl 0x00c32310
00abb7dc	bl 0x00c342a0
00abb7e0	adrp x2,0x2be000
00abb7e4	add x2,x2,#0x206
00abb7e8	mov w1,#0x4e
00abb7ec	mov x0,x20
00abb7f0	bl 0x00c342b0
00abb7f4	mov w1,#0x6
00abb7f8	mov w0,#0x23
00abb7fc	movk w1,#0x8, LSL #16
00abb800	b 0x00abb72c
00abb804	cmp w2,w24
00abb808	b.le 0x00abb888
00abb80c	bl 0x00c342a0
00abb810	adrp x0,0x2d2000
00abb814	adrp x2,0x2be000
00abb818	add x0,x0,#0x244
00abb81c	add x2,x2,#0x206
00abb820	mov w1,#0x3a
00abb824	bl 0x00c342b0
00abb828	mov w0,#0x23
00abb82c	mov w1,#0x77
00abb830	b 0x00abb72c
00abb834	adrp x20,0x2d2000
00abb838	add x20,x20,#0x244
00abb83c	mov w2,#0x54
00abb840	mov x0,x23
00abb844	mov x1,x20
00abb848	bl 0x00c32310
00abb84c	bl 0x00c342a0
00abb850	adrp x2,0x2be000
00abb854	add x2,x2,#0x206
00abb858	mov w1,#0x56
00abb85c	mov x0,x20
00abb860	bl 0x00c342b0
00abb864	adrp x8,0x2d4000
00abb868	adrp x9,0x2dc000
00abb86c	add x8,x8,#0x338
00abb870	add x9,x9,#0x84f
00abb874	cmp w22,#0x0
00abb878	csel x2,x9,x8,eq
00abb87c	mov w0,#0x23
00abb880	mov w1,#0x74
00abb884	b 0x00abb730
00abb888	sub w24,w24,w2
00abb88c	add x3,x25,w24, SXTW 
00abb890	mov w1,#0x11
00abb894	mov x0,x19
00abb898	bl 0x00c361b0
00abb89c	tbz w0,#0x1f,0x00abb658
00abb8a0	bl 0x00c342a0
00abb8a4	adrp x0,0x2d2000
00abb8a8	adrp x2,0x2be000
00abb8ac	add x0,x0,#0x244
00abb8b0	add x2,x2,#0x206
00abb8b4	mov w1,#0x40
00abb8b8	b 0x00abb7b0
00abb8bc	adrp x20,0x2d2000
00abb8c0	add x20,x20,#0x244
00abb8c4	mov w2,#0x61
00abb8c8	mov x0,x23
00abb8cc	mov x1,x20
00abb8d0	bl 0x00c32310
00abb8d4	bl 0x00c342a0
00abb8d8	adrp x2,0x2be000
00abb8dc	add x2,x2,#0x206
00abb8e0	mov w1,#0x63
00abb8e4	mov x0,x20
00abb8e8	b 0x00abb7b0
