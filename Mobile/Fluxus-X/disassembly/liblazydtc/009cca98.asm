; ssl3_record_sequence_update @ 009cca98
009cca98	ldrb w8,[x0, #0x7]
009cca9c	add w8,w8,#0x1
009ccaa0	tst w8,#0xff
009ccaa4	strb w8,[x0, #0x7]
009ccaa8	b.ne 0x009ccb30
009ccaac	ldrb w8,[x0, #0x6]
009ccab0	add w8,w8,#0x1
009ccab4	tst w8,#0xff
009ccab8	strb w8,[x0, #0x6]
009ccabc	b.ne 0x009ccb30
009ccac0	ldrb w8,[x0, #0x5]
009ccac4	add w8,w8,#0x1
009ccac8	tst w8,#0xff
009ccacc	strb w8,[x0, #0x5]
009ccad0	b.ne 0x009ccb30
009ccad4	ldrb w8,[x0, #0x4]
009ccad8	add w8,w8,#0x1
009ccadc	tst w8,#0xff
009ccae0	strb w8,[x0, #0x4]
009ccae4	b.ne 0x009ccb30
009ccae8	ldrb w8,[x0, #0x3]
009ccaec	add w8,w8,#0x1
009ccaf0	tst w8,#0xff
009ccaf4	strb w8,[x0, #0x3]
009ccaf8	b.ne 0x009ccb30
009ccafc	ldrb w8,[x0, #0x2]
009ccb00	add w8,w8,#0x1
009ccb04	tst w8,#0xff
009ccb08	strb w8,[x0, #0x2]
009ccb0c	b.ne 0x009ccb30
009ccb10	ldrb w8,[x0, #0x1]
009ccb14	add w8,w8,#0x1
009ccb18	tst w8,#0xff
009ccb1c	strb w8,[x0, #0x1]
009ccb20	b.ne 0x009ccb30
009ccb24	ldrb w8,[x0]
009ccb28	add w8,w8,#0x1
009ccb2c	strb w8,[x0]
009ccb30	ret
