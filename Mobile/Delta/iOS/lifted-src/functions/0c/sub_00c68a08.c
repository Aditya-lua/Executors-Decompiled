/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc68a08..0xc68a50 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c68a08_1 {
    char padding_0[40];
    struct st_c68a08_0 *field_28;
} st_c68a08_1;

typedef struct st_c68a08_0 {
    struct st_c68a08_0 *field_0;
} st_c68a08_0;


void sub_c68a08(st_c68a08_1 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_c68a08_0 **v8;  // x20
    st_c68a08_0 **v9;  // x20
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0->field_28;
    if (a0->field_28)
    {
        while (1)
        {
            v9 = v8;
            if (!sub_c68a50(a0, v9, 0))
                break;
            v8 = *v9;
            if (!*v9)
                break;
        }
    }
}
