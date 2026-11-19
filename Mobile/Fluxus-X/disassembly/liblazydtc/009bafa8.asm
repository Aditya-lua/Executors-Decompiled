; FUN_009bafa8 @ 009bafa8
009bafa8	stp x20,x19,[sp, #-0x20]!
009bafac	mov x20,x0
009bafb0	mov x0,x1
009bafb4	stp x29,x30,[sp, #0x10]
009bafb8	add x29,sp,#0x10
009bafbc	bl 0x00c308a0
009bafc0	mov w19,w0
009bafc4	tbnz w0,#0x1f,0x009baff4
009bafc8	ldr x0,[x20, #0x18]
009bafcc	cbz x0,0x009bafd8
009bafd0	sxtw x1,w19
009bafd4	bl 0x00c359b0
009bafd8	ldr x8,[x20, #0x20]
009bafdc	cbz x8,0x009baff8
009bafe0	ldp x29,x30,[sp, #0x10]
009bafe4	sxtw x1,w19
009bafe8	mov x0,x8
009bafec	ldp x20,x19,[sp], #0x20
009baff0	b 0x00c35a90
009baff4	mov w0,wzr
009baff8	ldp x29,x30,[sp, #0x10]
009baffc	ldp x20,x19,[sp], #0x20
009bb000	ret
