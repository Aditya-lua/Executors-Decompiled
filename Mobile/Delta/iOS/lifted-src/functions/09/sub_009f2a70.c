/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f2a70..0x9f2ae0 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f2a70_0 {
    struct st_9f2a70_0 *field_0;
    char padding_8[8];
    struct st_9f2a70_0 *field_10;
} st_9f2a70_0;


int sub_9f2a70(st_9f2a70_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_9f2a70_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = sub_a6bffc(48, "crypto/comp/comp_lib.c", 25);
        if (v8)
        {
            v8->field_0 = a0;
            if (a0->field_10)
                a0->field_10();
        }
        a0 = v8;
    }
    return (unsigned int)a0;
}
