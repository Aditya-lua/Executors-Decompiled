; FUN_00af66d8 @ 00af66d8
00af66d8	str x23,[sp, #-0x40]!
00af66dc	stp x22,x21,[sp, #0x10]
00af66e0	stp x20,x19,[sp, #0x20]
00af66e4	mov w20,w3
00af66e8	mov x21,x0
00af66ec	mov w0,wzr
00af66f0	stp x29,x30,[sp, #0x30]
00af66f4	add x29,sp,#0x30
00af66f8	cbz x21,0x00af68ac
00af66fc	mov x22,x1
00af6700	cbz x1,0x00af68ac
00af6704	mov x19,x2
00af6708	cbz x2,0x00af68ac
00af670c	ldr w8,[x21]
00af6710	cmp w8,#0x1
00af6714	b.eq 0x00af67a8
00af6718	mov w0,wzr
00af671c	cbnz w8,0x00af68ac
00af6720	ldr x23,[x21, #0x8]
00af6724	ldr w8,[x23]
00af6728	tbnz w8,#0x1f,0x00af68a8
00af672c	cmp w8,w20
00af6730	mov w0,wzr
00af6734	b.gt 0x00af68ac
00af6738	sxtw x2,w8
00af673c	cmp w2,#0x1
00af6740	b.lt 0x00af6780
00af6744	ldr x1,[x23, #0x8]
00af6748	mov x0,x22
00af674c	bl 0x00c2ffd0
00af6750	ldr x8,[x23, #0x10]
00af6754	ands x8,x8,#0x7
00af6758	b.eq 0x00af6780
00af675c	ldrsw x9,[x23]
00af6760	mov w10,#0x8
00af6764	sub w8,w10,w8
00af6768	orr w10,wzr,#0xffffff00
00af676c	add x9,x22,x9
00af6770	ldurb w11,[x9, #-0x1]
00af6774	asr w8,w10,w8
00af6778	and w8,w11,w8
00af677c	sturb w8,[x9, #-0x1]
00af6780	ldrsw x8,[x23]
00af6784	sxtw x9,w20
00af6788	mov w1,wzr
00af678c	add x0,x22,x8
00af6790	sub x2,x9,x8
00af6794	bl 0x00c301c0
00af6798	ldr x21,[x21, #0x8]
00af679c	ldr w8,[x21]
00af67a0	tbz w8,#0x1f,0x00af6834
00af67a4	b 0x00af68a8
00af67a8	ldr x8,[x21, #0x8]
00af67ac	ldr x23,[x8]
00af67b0	ldr w8,[x23]
00af67b4	tbnz w8,#0x1f,0x00af68a8
00af67b8	cmp w8,w20
00af67bc	mov w0,wzr
00af67c0	b.gt 0x00af68ac
00af67c4	sxtw x2,w8
00af67c8	cmp w2,#0x1
00af67cc	b.lt 0x00af680c
00af67d0	ldr x1,[x23, #0x8]
00af67d4	mov x0,x22
00af67d8	bl 0x00c2ffd0
00af67dc	ldr x8,[x23, #0x10]
00af67e0	ands x8,x8,#0x7
00af67e4	b.eq 0x00af680c
00af67e8	ldrsw x9,[x23]
00af67ec	mov w10,#0x8
00af67f0	sub w8,w10,w8
00af67f4	orr w10,wzr,#0xffffff00
00af67f8	add x9,x22,x9
00af67fc	ldurb w11,[x9, #-0x1]
00af6800	asr w8,w10,w8
00af6804	and w8,w11,w8
00af6808	sturb w8,[x9, #-0x1]
00af680c	ldrsw x8,[x23]
00af6810	sxtw x9,w20
00af6814	mov w1,wzr
00af6818	add x0,x22,x8
00af681c	sub x2,x9,x8
00af6820	bl 0x00c301c0
00af6824	ldr x8,[x21, #0x8]
00af6828	ldr x21,[x8, #0x8]
00af682c	ldr w8,[x21]
00af6830	tbnz w8,#0x1f,0x00af68a8
00af6834	cmp w8,w20
00af6838	mov w0,wzr
00af683c	b.gt 0x00af68ac
00af6840	sxtw x2,w8
00af6844	cmp w2,#0x1
00af6848	b.lt 0x00af6888
00af684c	ldr x1,[x21, #0x8]
00af6850	mov x0,x19
00af6854	bl 0x00c2ffd0
00af6858	ldr x8,[x21, #0x10]
00af685c	ands x8,x8,#0x7
00af6860	b.eq 0x00af6888
00af6864	ldrsw x9,[x21]
00af6868	mov w10,#0x8
00af686c	sub w8,w10,w8
00af6870	orr w10,wzr,#0xff
00af6874	add x9,x19,x9
00af6878	ldurb w11,[x9, #-0x1]
00af687c	lsr w8,w10,w8
00af6880	orr w8,w11,w8
00af6884	sturb w8,[x9, #-0x1]
00af6888	ldrsw x8,[x21]
00af688c	sxtw x9,w20
00af6890	orr w1,wzr,#0xff
00af6894	add x0,x19,x8
00af6898	sub x2,x9,x8
00af689c	bl 0x00c301c0
00af68a0	mov w0,#0x1
00af68a4	b 0x00af68ac
00af68a8	mov w0,wzr
00af68ac	ldp x29,x30,[sp, #0x30]
00af68b0	ldp x20,x19,[sp, #0x20]
00af68b4	ldp x22,x21,[sp, #0x10]
00af68b8	ldr x23,[sp], #0x40
00af68bc	ret
