; OCSP_check_nonce @ 00ab1110
00ab1110	stp x22,x21,[sp, #-0x30]!
00ab1114	stp x20,x19,[sp, #0x10]
00ab1118	stp x29,x30,[sp, #0x20]
00ab111c	mov x20,x0
00ab1120	ldr x0,[x0, #0x18]
00ab1124	mov x19,x1
00ab1128	mov w1,#0x16e
00ab112c	mov w2,#0xffffffff
00ab1130	add x29,sp,#0x20
00ab1134	bl 0x00c3eff0
00ab1138	ldr x8,[x19, #0x28]
00ab113c	mov w22,w0
00ab1140	mov w1,#0x16e
00ab1144	mov w2,#0xffffffff
00ab1148	mov x0,x8
00ab114c	bl 0x00c3eff0
00ab1150	tst w0,w22
00ab1154	b.lt 0x00ab116c
00ab1158	mov w21,w0
00ab115c	tbnz w22,#0x1f,0x00ab1174
00ab1160	tbz w21,#0x1f,0x00ab1174
00ab1164	mov w0,#0xffffffff
00ab1168	b 0x00ab11d0
00ab116c	mov w0,#0x2
00ab1170	b 0x00ab11d0
00ab1174	tbz w22,#0x1f,0x00ab1184
00ab1178	tbnz w21,#0x1f,0x00ab1184
00ab117c	orr w0,wzr,#0x3
00ab1180	b 0x00ab11d0
00ab1184	ldr x0,[x20, #0x18]
00ab1188	mov w1,w22
00ab118c	bl 0x00c3efe0
00ab1190	ldr x8,[x19, #0x28]
00ab1194	mov x19,x0
00ab1198	mov w1,w21
00ab119c	mov x0,x8
00ab11a0	bl 0x00c3efe0
00ab11a4	mov x20,x0
00ab11a8	mov x0,x19
00ab11ac	bl 0x00c32b60
00ab11b0	mov x19,x0
00ab11b4	mov x0,x20
00ab11b8	bl 0x00c32b60
00ab11bc	mov x1,x0
00ab11c0	mov x0,x19
00ab11c4	bl 0x00c37780
00ab11c8	cmp w0,#0x0
00ab11cc	cset w0,eq
00ab11d0	ldp x29,x30,[sp, #0x20]
00ab11d4	ldp x20,x19,[sp, #0x10]
00ab11d8	ldp x22,x21,[sp], #0x30
00ab11dc	ret
