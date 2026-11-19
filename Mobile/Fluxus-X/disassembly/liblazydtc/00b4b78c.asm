; ossl_DER_w_null @ 00b4b78c
00b4b78c	sub sp,sp,#0x30
00b4b790	stp x20,x19,[sp, #0x10]
00b4b794	mov w20,w1
00b4b798	mov x19,x0
00b4b79c	stp x29,x30,[sp, #0x20]
00b4b7a0	add x29,sp,#0x20
00b4b7a4	tbnz w1,#0x1f,0x00b4b7c0
00b4b7a8	cmp w20,#0x1e
00b4b7ac	mov w0,wzr
00b4b7b0	b.gt 0x00b4b82c
00b4b7b4	mov x0,x19
00b4b7b8	bl 0x00c37240
00b4b7bc	cbz w0,0x00b4b82c
00b4b7c0	mov x0,x19
00b4b7c4	bl 0x00c37240
00b4b7c8	cbz w0,0x00b4b82c
00b4b7cc	mov x0,x19
00b4b7d0	bl 0x00c34350
00b4b7d4	cbz w0,0x00b4b82c
00b4b7d8	mov w1,#0x5
00b4b7dc	mov w2,#0x1
00b4b7e0	mov x0,x19
00b4b7e4	bl 0x00c343a0
00b4b7e8	cbz w0,0x00b4b82c
00b4b7ec	tbnz w20,#0x1f,0x00b4b828
00b4b7f0	add x1,sp,#0x8
00b4b7f4	mov x0,x19
00b4b7f8	bl 0x00c34370
00b4b7fc	cbz w0,0x00b4b82c
00b4b800	mov x0,x19
00b4b804	bl 0x00c34350
00b4b808	cbz w0,0x00b4b82c
00b4b80c	mov x1,sp
00b4b810	mov x0,x19
00b4b814	bl 0x00c34370
00b4b818	cbz w0,0x00b4b82c
00b4b81c	ldp x9,x8,[sp]
00b4b820	cmp x8,x9
00b4b824	b.ne 0x00b4b83c
00b4b828	mov w0,#0x1
00b4b82c	ldp x29,x30,[sp, #0x20]
00b4b830	ldp x20,x19,[sp, #0x10]
00b4b834	add sp,sp,#0x30
00b4b838	ret
00b4b83c	mov w8,#0xa0
00b4b840	orr w8,w20,w8
00b4b844	sxtw x1,w8
00b4b848	mov w2,#0x1
00b4b84c	mov x0,x19
00b4b850	bl 0x00c343a0
00b4b854	cmp w0,#0x0
00b4b858	cset w0,ne
00b4b85c	b 0x00b4b82c
