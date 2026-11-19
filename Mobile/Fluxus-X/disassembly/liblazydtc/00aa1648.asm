; ossl_pw_pem_password @ 00aa1648
00aa1648	sub sp,sp,#0x90
00aa164c	stp x22,x21,[sp, #0x60]
00aa1650	stp x20,x19,[sp, #0x70]
00aa1654	stp x29,x30,[sp, #0x80]
00aa1658	add x29,sp,#0x80
00aa165c	mov w20,w2
00aa1660	mov w21,w1
00aa1664	mov x22,x0
00aa1668	add x0,sp,#0x8
00aa166c	mov w2,#0x50
00aa1670	mov w1,wzr
00aa1674	mov x19,x3
00aa1678	stur xzr,[x29, #-0x28]
00aa167c	bl 0x00c301c0
00aa1680	adrp x8,0x29e000
00aa1684	adrp x11,0x2b9000
00aa1688	add x8,x8,#0x225
00aa168c	mov w9,#0x4
00aa1690	mov x10,#-0x1
00aa1694	add x11,x11,#0x56f
00aa1698	sxtw x1,w21
00aa169c	sub x2,x29,#0x28
00aa16a0	add x3,sp,#0x8
00aa16a4	mov x0,x22
00aa16a8	mov w4,w20
00aa16ac	mov x5,x19
00aa16b0	str x8,[sp, #0x8]
00aa16b4	str w9,[sp, #0x10]
00aa16b8	str x10,[sp, #0x28]
00aa16bc	str x11,[sp, #0x18]
00aa16c0	bl 0x00aa1074
00aa16c4	ldur w8,[x29, #-0x28]
00aa16c8	ldp x29,x30,[sp, #0x80]
00aa16cc	ldp x20,x19,[sp, #0x70]
00aa16d0	ldp x22,x21,[sp, #0x60]
00aa16d4	cmp w0,#0x0
00aa16d8	csinv w0,w8,wzr,ne
00aa16dc	add sp,sp,#0x90
00aa16e0	ret
