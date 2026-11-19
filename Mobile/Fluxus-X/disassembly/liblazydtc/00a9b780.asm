; FUN_00a9b780 @ 00a9b780
00a9b780	stp x26,x25,[sp, #-0x50]!
00a9b784	stp x22,x21,[sp, #0x20]
00a9b788	stp x20,x19,[sp, #0x30]
00a9b78c	mov w20,w4
00a9b790	mov x21,x3
00a9b794	mov x19,x2
00a9b798	mov x22,x1
00a9b79c	mov x25,xzr
00a9b7a0	stp x24,x23,[sp, #0x10]
00a9b7a4	stp x29,x30,[sp, #0x40]
00a9b7a8	add x29,sp,#0x40
00a9b7ac	b 0x00a9b7bc
00a9b7b0	orr w8,w24,w8, LSL #0x4
00a9b7b4	strb w8,[x26], #0x1
00a9b7b8	mov x0,x26
00a9b7bc	mov x26,x0
00a9b7c0	add x21,x21,#0x1
00a9b7c4	ldurb w23,[x21, #-0x1]
00a9b7c8	cbz w23,0x00a9b840
00a9b7cc	tst w20,#0xff
00a9b7d0	add x21,x21,#0x1
00a9b7d4	b.eq 0x00a9b7e0
00a9b7d8	cmp w23,w20, UXTB 
00a9b7dc	b.eq 0x00a9b7c4
00a9b7e0	ldurb w0,[x21, #-0x1]
00a9b7e4	cbz w0,0x00a9b864
00a9b7e8	bl 0x00a9b750
00a9b7ec	mov w24,w0
00a9b7f0	mov w0,w23
00a9b7f4	bl 0x00a9b750
00a9b7f8	orr w9,w0,w24
00a9b7fc	tbnz w9,#0x1f,0x00a9b88c
00a9b800	mov w8,w0
00a9b804	mov x0,xzr
00a9b808	add x25,x25,#0x1
00a9b80c	cbz x26,0x00a9b7bc
00a9b810	cmp x25,x22
00a9b814	b.ls 0x00a9b7b0
00a9b818	bl 0x00c342a0
00a9b81c	adrp x0,0x2c9000
00a9b820	adrp x2,0x2b4000
00a9b824	add x0,x0,#0xd7c
00a9b828	add x2,x2,#0x4a1
00a9b82c	mov w1,#0xa6
00a9b830	bl 0x00c342b0
00a9b834	orr w0,wzr,#0xf
00a9b838	mov w1,#0x74
00a9b83c	b 0x00a9b8b0
00a9b840	cbz x19,0x00a9b848
00a9b844	str x25,[x19]
00a9b848	mov w0,#0x1
00a9b84c	ldp x29,x30,[sp, #0x40]
00a9b850	ldp x20,x19,[sp, #0x30]
00a9b854	ldp x22,x21,[sp, #0x20]
00a9b858	ldp x24,x23,[sp, #0x10]
00a9b85c	ldp x26,x25,[sp], #0x50
00a9b860	ret
00a9b864	bl 0x00c342a0
00a9b868	adrp x0,0x2c9000
00a9b86c	adrp x2,0x2b4000
00a9b870	add x0,x0,#0xd7c
00a9b874	add x2,x2,#0x4a1
00a9b878	mov w1,#0x9a
00a9b87c	bl 0x00c342b0
00a9b880	orr w0,wzr,#0xf
00a9b884	mov w1,#0x67
00a9b888	b 0x00a9b8b0
00a9b88c	bl 0x00c342a0
00a9b890	adrp x0,0x2c9000
00a9b894	adrp x2,0x2b4000
00a9b898	add x0,x0,#0xd7c
00a9b89c	add x2,x2,#0x4a1
00a9b8a0	mov w1,#0xa0
00a9b8a4	bl 0x00c342b0
00a9b8a8	orr w0,wzr,#0xf
00a9b8ac	mov w1,#0x66
00a9b8b0	mov x2,xzr
00a9b8b4	bl 0x00c342c0
00a9b8b8	mov w0,wzr
00a9b8bc	b 0x00a9b84c
