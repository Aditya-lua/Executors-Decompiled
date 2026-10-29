/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb82a08..0xb82c84 (636 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b82a08_0 {
    unsigned long long field_0;
    struct st_b82a08_0 *field_8;
} st_b82a08_0;

extern char g_e061eb;

long long sub_b82a08(unsigned long a0, st_b82a08_0 *a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long v16;  // x8
    st_b82a08_0 *v17;  // x1
    st_b82a08_0 *v18;  // x1
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = a1->field_0;
    if (a1->field_0 == 8)
    {
        do
        {
            v17 = a1;
            v18 = v17->field_8;
            v16 = v17->field_8->field_0;
            a1 = v18;
        } while (v17->field_8->field_0 == 8);
    }
    goto *((void *)(sub_b82a54 + (&g_e061eb)[v16] * 4));
}
