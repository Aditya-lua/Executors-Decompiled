; cpr::Session::SetHttpVersion @ 008ef1e0
008ef1e0	stp x20,x19,[sp, #-0x20]!
008ef1e4	stp x29,x30,[sp, #0x10]
008ef1e8	add x29,sp,#0x10
008ef1ec	ldr w8,[x1]
008ef1f0	cmp w8,#0x6
008ef1f4	b.hi 0x008ef288
008ef1f8	adrp x9,0x745000
008ef1fc	add x9,x9,#0x150
008ef200	ldrsw x8,[x9, x8, LSL #0x2]
008ef204	add x8,x8,x9
008ef208	br x8
008ef20c	ldr x8,[x0, #0x18]
008ef210	mov w1,#0x54
008ef214	mov w2,wzr
008ef218	b 0x008ef278
008ef21c	ldr x8,[x0, #0x18]
008ef220	mov w1,#0x54
008ef224	mov w2,#0x4
008ef228	b 0x008ef278
008ef22c	ldr x8,[x0, #0x18]
008ef230	mov w1,#0x54
008ef234	mov w2,#0x2
008ef238	b 0x008ef278
008ef23c	ldr x8,[x0, #0x18]
008ef240	mov w1,#0x54
008ef244	orr w2,wzr,#0x3
008ef248	b 0x008ef278
008ef24c	ldr x8,[x0, #0x18]
008ef250	mov w1,#0x54
008ef254	mov w2,#0x1
008ef258	b 0x008ef278
008ef25c	ldr x8,[x0, #0x18]
008ef260	mov w1,#0x54
008ef264	mov w2,#0x5
008ef268	b 0x008ef278
008ef26c	ldr x8,[x0, #0x18]
008ef270	mov w1,#0x54
008ef274	orr w2,wzr,#0x1e
008ef278	ldr x0,[x8]
008ef27c	ldp x29,x30,[sp, #0x10]
008ef280	ldp x20,x19,[sp], #0x20
008ef284	b 0x00c317c0
008ef288	mov w0,#0x10
008ef28c	bl 0x00c30000
008ef290	mov x19,x0
008ef294	adrp x1,0x2a9000
008ef298	add x1,x1,#0x47d
008ef29c	bl 0x00c30040
008ef2a0	adrp x8,0xcb4000
008ef2a4	ldr x8,[x8, #0xc30]
008ef2a8	adrp x1,0xcb4000
008ef2ac	adrp x2,0xcb4000
008ef2b0	mov x0,x19
008ef2b4	add x8,x8,#0x10
008ef2b8	str x8,[x19]
008ef2bc	ldr x1,[x1, #0xc10]
008ef2c0	ldr x2,[x2, #0xc18]
008ef2c4	bl 0x00c30020
