; SSL3_BUFFER_set_data @ 009ccb4c
009ccb4c	stp x20,x19,[sp, #-0x20]!
009ccb50	mov x19,x2
009ccb54	mov x20,x0
009ccb58	stp x29,x30,[sp, #0x10]
009ccb5c	add x29,sp,#0x10
009ccb60	cbz x1,0x009ccb70
009ccb64	ldr x0,[x20]
009ccb68	mov x2,x19
009ccb6c	bl 0x00c2ffd0
009ccb70	stp xzr,x19,[x20, #0x18]
009ccb74	ldp x29,x30,[sp, #0x10]
009ccb78	ldp x20,x19,[sp], #0x20
009ccb7c	ret
