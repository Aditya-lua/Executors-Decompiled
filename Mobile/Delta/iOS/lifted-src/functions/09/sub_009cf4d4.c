/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cf4d4..0x9cf574 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cf4d4_2 {
    long long field_0;
    unsigned long long field_8;
} st_9cf4d4_2;

typedef struct st_9cf4d4_0 {
    char padding_0[8];
    char field_8;
    char padding_9[23];
    int field_20;
} st_9cf4d4_0;

typedef struct st_9cf4d4_1 {
    char padding_0[32];
    struct st_9cf4d4_0 *field_20;
} st_9cf4d4_1;


char sub_9cf4d4(char a0, char a1, unsigned long a2, st_9cf4d4_1 *a3)
{
    st_9cf4d4_0 *v7;  // x9
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    st_9cf4d4_2 *v13;  // x19
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a2)
    {
        return 0;
    }
    else if (*(long long *)a2)
    {
        v7 = a3->field_20;
        if (!v7)
            return 0;
        v0 = v8;
        v1 = v9;
        v2 = v10;
        v3 = v11;
        v4 = &v6;
        v5 = v12;
        if (!(v7->field_8 >> 1 & 1))
            return 0;
        v13 = *(long long *)a2 + v7->field_20;
        if (!(int)v13[1].field_0)
        {
            if (a1)
            {
                _memcpy(*(long long *)a1, v13->field_0, v13->field_8);
                *(unsigned long long *)a1 = *(long long *)a1 + v13->field_8;
            }
            if (!a0)
                return 1;
            *(unsigned int *)a0 = v13->field_8;
            return 1;
        }
        return 0;
    }
    else
    {
        return 0;
    }
}
