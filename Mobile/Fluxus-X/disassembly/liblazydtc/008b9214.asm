; FUN_008b9214 @ 008b9214
008b9214	ldr w8,[x0, #0xc]
008b9218	ldr w9,[x1, #0xc]
008b921c	cmp w8,w9
008b9220	b.ne 0x008b92c8
008b9224	cmp w8,#0x1
008b9228	b.le 0x008b9258
008b922c	cmp w8,#0x2
008b9230	b.eq 0x008b9270
008b9234	cmp w8,#0x4
008b9238	b.eq 0x008b9294
008b923c	cmp w8,#0x3
008b9240	b.ne 0x008b92d8
008b9244	ldr d0,[x0]
008b9248	ldr d1,[x1]
008b924c	fcmp d0,d1
008b9250	cset w0,eq
008b9254	ret
008b9258	cbz w8,0x008b92d0
008b925c	cmp w8,#0x1
008b9260	b.ne 0x008b92d8
008b9264	ldr w8,[x0]
008b9268	ldr w9,[x1]
008b926c	b 0x008b9288
008b9270	ldr x8,[x0]
008b9274	ldr x9,[x1]
008b9278	cmp x8,x9
008b927c	b.ne 0x008b92c8
008b9280	ldr w8,[x0, #0x8]
008b9284	ldr w9,[x1, #0x8]
008b9288	cmp w8,w9
008b928c	cset w0,eq
008b9290	ret
008b9294	ldr s0,[x0]
008b9298	ldr s1,[x1]
008b929c	fcmp s0,s1
008b92a0	b.ne 0x008b92c8
008b92a4	ldr s0,[x0, #0x4]
008b92a8	ldr s1,[x1, #0x4]
008b92ac	fcmp s0,s1
008b92b0	b.ne 0x008b92c8
008b92b4	ldr s0,[x0, #0x8]
008b92b8	ldr s1,[x1, #0x8]
008b92bc	fcmp s0,s1
008b92c0	cset w0,eq
008b92c4	ret
008b92c8	mov w0,wzr
008b92cc	ret
008b92d0	mov w0,#0x1
008b92d4	ret
008b92d8	ldr x8,[x0]
008b92dc	ldr x9,[x1]
008b92e0	cmp x8,x9
008b92e4	cset w0,eq
008b92e8	ret
