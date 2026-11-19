; FUN_008cba50 @ 008cba50
008cba50	cmp x0,x1
008cba54	b.eq 0x008cbab0
008cba58	mov x8,x1
008cba5c	mov x9,x0
008cba60	ldrb w10,[x0, #0x18]!
008cba64	ldrb w11,[x1, #0x18]!
008cba68	subs w10,w10,w11
008cba6c	b.ne 0x008cbaa8
008cba70	stp x29,x30,[sp, #-0x20]!
008cba74	str x19,[sp, #0x10]
008cba78	mov x29,sp
008cba7c	ldr w9,[x9, #0x14]
008cba80	ldr w8,[x8, #0x14]
008cba84	cmp w9,w8
008cba88	csel w2,w9,w8,cc
008cba8c	cset w8,hi
008cba90	csinv w19,w8,wzr,cs
008cba94	bl 0x00c300b0
008cba98	cmp w0,#0x0
008cba9c	csel w10,w19,w0,eq
008cbaa0	ldr x19,[sp, #0x10]
008cbaa4	ldp x29,x30,[sp], #0x20
008cbaa8	mov w0,w10
008cbaac	ret
008cbab0	mov w0,wzr
008cbab4	ret
