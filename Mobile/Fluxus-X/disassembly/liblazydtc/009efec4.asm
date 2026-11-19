; ASN1_UTCTIME_set @ 009efec4
009efec4	sub sp,sp,#0x60
009efec8	stp x29,x30,[sp, #0x50]
009efecc	add x29,sp,#0x50
009efed0	str x19,[sp, #0x40]
009efed4	mov x19,x0
009efed8	stur x1,[x29, #-0x8]
009efedc	sub x0,x29,#0x8
009efee0	add x1,sp,#0x8
009efee4	bl 0x00c37980
009efee8	cbz x0,0x009efefc
009efeec	mov x1,x0
009efef0	mov w2,#0x17
009efef4	mov x0,x19
009efef8	bl 0x00c379c0
009efefc	ldp x29,x30,[sp, #0x50]
009eff00	ldr x19,[sp, #0x40]
009eff04	add sp,sp,#0x60
009eff08	ret
