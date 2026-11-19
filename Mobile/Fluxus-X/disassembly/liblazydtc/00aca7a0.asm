; ossl_rand_pool_bytes_needed @ 00aca7a0
00aca7a0	stp x20,x19,[sp, #-0x20]!
00aca7a4	stp x29,x30,[sp, #0x10]
00aca7a8	add x29,sp,#0x10
00aca7ac	cbz w1,0x00aca810
00aca7b0	ldp x9,x10,[x0, #0x30]
00aca7b4	ldr x13,[x0, #0x20]
00aca7b8	ldr x8,[x0, #0x8]
00aca7bc	mov w11,w1
00aca7c0	cmp x10,x9
00aca7c4	csel x10,x10,x9,hi
00aca7c8	orr x12,xzr,#0x7
00aca7cc	sub x9,x10,x9
00aca7d0	madd x9,x9,x11,x12
00aca7d4	lsr x20,x9,#0x3
00aca7d8	sub x9,x13,x8
00aca7dc	mov x19,x0
00aca7e0	cmp x20,x9
00aca7e4	b.ls 0x00aca844
00aca7e8	bl 0x00c342a0
00aca7ec	adrp x0,0x29e000
00aca7f0	adrp x2,0x2b0000
00aca7f4	add x0,x0,#0x966
00aca7f8	add x2,x2,#0x7ee
00aca7fc	mov w1,#0x104
00aca800	bl 0x00c342b0
00aca804	mov w0,#0x24
00aca808	mov w1,#0x7d
00aca80c	b 0x00aca834
00aca810	bl 0x00c342a0
00aca814	adrp x0,0x29e000
00aca818	adrp x2,0x2b0000
00aca81c	add x0,x0,#0x966
00aca820	add x2,x2,#0x7ee
00aca824	orr w1,wzr,#0xfc
00aca828	bl 0x00c342b0
00aca82c	mov w0,#0x24
00aca830	mov w1,#0x69
00aca834	mov x2,xzr
00aca838	bl 0x00c342c0
00aca83c	mov x20,xzr
00aca840	b 0x00aca874
00aca844	ldr x9,[x19, #0x18]
00aca848	subs x8,x9,x8
00aca84c	b.ls 0x00aca858
00aca850	cmp x20,x8
00aca854	csel x20,x8,x20,cc
00aca858	mov x0,x19
00aca85c	mov x1,x20
00aca860	bl 0x00aca884
00aca864	cbnz w0,0x00aca874
00aca868	mov x20,xzr
00aca86c	str xzr,[x19, #0x8]
00aca870	str xzr,[x19, #0x20]
00aca874	ldp x29,x30,[sp, #0x10]
00aca878	mov x0,x20
00aca87c	ldp x20,x19,[sp], #0x20
00aca880	ret
