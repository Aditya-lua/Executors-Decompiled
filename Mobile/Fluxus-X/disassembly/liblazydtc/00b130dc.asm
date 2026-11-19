; X509_policy_tree_get0_level @ 00b130dc
00b130dc	mov x8,x0
00b130e0	mov x0,xzr
00b130e4	cbz x8,0x00b13108
00b130e8	tbnz w1,#0x1f,0x00b13108
00b130ec	ldr w9,[x8, #0x18]
00b130f0	mov x0,xzr
00b130f4	cmp w9,w1
00b130f8	b.le 0x00b13108
00b130fc	ldr x8,[x8, #0x10]
00b13100	sxtw x9,w1
00b13104	add x0,x8,x9, LSL #0x5
00b13108	ret
