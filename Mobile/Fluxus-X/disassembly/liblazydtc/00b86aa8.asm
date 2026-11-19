; psa_copy_key_material_into_slot @ 00b86aa8
00b86aa8	str x21,[sp, #-0x30]!
00b86aac	stp x20,x19,[sp, #0x10]
00b86ab0	stp x29,x30,[sp, #0x20]
00b86ab4	add x29,sp,#0x20
00b86ab8	ldr x8,[x0, #0x28]
00b86abc	mov x19,x2
00b86ac0	mov x21,x0
00b86ac4	mov x20,x1
00b86ac8	cbz x8,0x00b86ad4
00b86acc	mov w0,#0xffffff75
00b86ad0	b 0x00b86b04
00b86ad4	mov w0,#0x1
00b86ad8	mov x1,x19
00b86adc	bl 0x00c30a30
00b86ae0	str x0,[x21, #0x28]
00b86ae4	cbz x0,0x00b86b00
00b86ae8	mov x1,x20
00b86aec	mov x2,x19
00b86af0	str x19,[x21, #0x30]
00b86af4	bl 0x00c2ffd0
00b86af8	mov w0,wzr
00b86afc	b 0x00b86b04
00b86b00	mov w0,#0xffffff73
00b86b04	ldp x29,x30,[sp, #0x20]
00b86b08	ldp x20,x19,[sp, #0x10]
00b86b0c	ldr x21,[sp], #0x30
00b86b10	ret
