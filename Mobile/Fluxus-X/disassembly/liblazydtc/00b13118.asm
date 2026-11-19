; X509_policy_tree_get0_user_policies @ 00b13118
00b13118	cbz x0,0x00b13134
00b1311c	ldrb w8,[x0, #0x38]
00b13120	mov w9,#0x28
00b13124	tst w8,#0x2
00b13128	orr w8,wzr,#0x30
00b1312c	csel x8,x8,x9,eq
00b13130	ldr x0,[x0, x8#0x0]
00b13134	ret
