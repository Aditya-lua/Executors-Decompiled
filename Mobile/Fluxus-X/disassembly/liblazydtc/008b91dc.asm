; FUN_008b91dc @ 008b91dc
008b91dc	mov w8,#0xffffffff
008b91e0	cmp w0,#0x100
008b91e4	b.cc 0x008b9200
008b91e8	mov w9,w0
008b91ec	lsr w0,w9,#0x8
008b91f0	lsr w10,w9,#0x10
008b91f4	add w8,w8,#0x8
008b91f8	mov w9,w0
008b91fc	cbnz w10,0x008b91ec
008b9200	adrp x9,0x364000
008b9204	add x9,x9,#0xb99
008b9208	ldrb w9,[x9, w0, UXTW ]
008b920c	add w0,w8,w9
008b9210	ret
