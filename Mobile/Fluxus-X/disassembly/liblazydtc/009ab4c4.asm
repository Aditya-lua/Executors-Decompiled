; ssl3_digest_master_key_set_params @ 009ab4c4
009ab4c4	sub sp,sp,#0x50
009ab4c8	stp x29,x30,[sp, #0x40]
009ab4cc	ldr x2,[x0, #0x8]
009ab4d0	str x19,[sp, #0x30]
009ab4d4	mov x19,x1
009ab4d8	add x1,x0,#0x50
009ab4dc	adrp x0,0x2b3000
009ab4e0	add x0,x0,#0xc71
009ab4e4	add x8,sp,#0x8
009ab4e8	add x29,sp,#0x40
009ab4ec	bl 0x00c34c50
009ab4f0	ldr x8,[sp, #0x28]
009ab4f4	str x8,[x19, #0x20]
009ab4f8	ldur q0,[sp, #0x18]
009ab4fc	add x8,sp,#0x8
009ab500	str q0,[x19, #0x10]
009ab504	ldur q0,[sp, #0x8]
009ab508	str q0,[x19]
009ab50c	bl 0x00c34c40
009ab510	ldr x8,[sp, #0x28]
009ab514	str x8,[x19, #0x48]
009ab518	ldur q0,[sp, #0x18]
009ab51c	stur q0,[x19, #0x38]
009ab520	ldur q0,[sp, #0x8]
009ab524	stur q0,[x19, #0x28]
009ab528	ldp x29,x30,[sp, #0x40]
009ab52c	ldr x19,[sp, #0x30]
009ab530	add sp,sp,#0x50
009ab534	ret
