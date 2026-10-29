/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cf6d4..0x9cf764 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cf6d4_0 {
    long long field_0;
    struct st_9cf6d4_0 *field_8;
} st_9cf6d4_0;


int sub_9cf6d4(st_9cf6d4_0 *a0, long long a1, unsigned long long a2, long long a3)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // 4147
    st_9cf6d4_0 *v13;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a0)
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        v12 = arm64g_calculate_condition(1, a2 & 0xffffffff, 1, 0);
        if (!(v12 & 1))
        {
            if (!a0->field_8 && !(v13 = sub_9cf1f0(), a0->field_8 = v13, v13))
                goto LABEL_9cf754;
            sub_9c3580(a0->field_0);
            a0->field_0 = a1;
            if ((unsigned int)a2)
                sub_9c536c(a0->field_8, a2, a3);
        }
        else
        {
            sub_9c3580(a0->field_0);
            a0->field_0 = a1;
            sub_9cf1fc(a0->field_8);
            a0->field_8 = 0;
        }
        v13 = 1;
LABEL_9cf754:
        a0 = v13;
    }
    return (unsigned int)a0;
}
