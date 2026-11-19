; FUN_00850ba0 @ 00850ba0
00850ba0	stp x29,x30,[sp, #-0x30]!
00850ba4	str x21,[sp, #0x10]
00850ba8	stp x20,x19,[sp, #0x20]
00850bac	mov x29,sp
00850bb0	ldr x8,[x1]
00850bb4	mov x20,x0
00850bb8	mov x19,x1
00850bbc	mov x0,x1
00850bc0	mov x1,x20
00850bc4	ldr x8,[x8, #0x198]
00850bc8	blr x8
00850bcc	tbz w0,#0x0,0x00850c14
00850bd0	ldr x8,[x20, #0x70]
00850bd4	cbz x8,0x00850c14
00850bd8	ldr x9,[x20, #0x68]
00850bdc	lsl x20,x8,#0x4
00850be0	add x21,x9,#0x8
00850be4	b 0x00850c04
00850be8	ldr x8,[x0]
00850bec	mov x1,x19
00850bf0	ldr x8,[x8]
00850bf4	blr x8
00850bf8	subs x20,x20,#0x10
00850bfc	add x21,x21,#0x10
00850c00	b.eq 0x00850c14
00850c04	ldur x0,[x21, #-0x8]
00850c08	cbnz x0,0x00850be8
00850c0c	ldr x0,[x21]
00850c10	b 0x00850be8
00850c14	ldp x20,x19,[sp, #0x20]
00850c18	ldr x21,[sp, #0x10]
00850c1c	ldp x29,x30,[sp], #0x30
00850c20	ret
