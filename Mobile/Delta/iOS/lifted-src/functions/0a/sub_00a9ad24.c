/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9ad24..0xa9ae30 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9ad24_0 {
    char field_0;
    char padding_1[7];
    char field_8;
    char padding_9[7];
    unsigned int field_10;
    int field_14;
    char field_18;
} st_a9ad24_0;


void* sub_a9ad24(void* a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    char v8;  // x0
    st_a9ad24_0 *v9;  // x19
    void* v10;  // x8
    unsigned int v11;  // w1
    char v12;  // x0
    char v13;  // x0
    char v14;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
    {
        return a0;
    }
    else if ((char)a0[32] & 1)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = sub_9c3624();
        if (v8)
        {
            v9 = (st_a9ad24_0 *)v8;
            v10 = a0;
            *(unsigned int *)(v8 + 32) = (int)a0[32] | 13;
            v11 = (int)a0[20];
            if ((int)v11 >= 1)
            {
                v12 = sub_a6dac4((long long)v10[24]);
                *(unsigned long long *)&v9->field_18 = v12;
                if (!v12)
                    goto LABEL_a9ae18;
                v10 = a0;
                v11 = (int)a0[20];
            }
            v9->field_10 = (int)v10[16];
            v9->field_14 = v11;
            if (!(long long)v10[8] || (v13 = sub_a6d9b4((long long)v10[8], "crypto/objects/obj_lib.c", 42), v10 = a0, *(unsigned long long *)&v9->field_8 = v13, v13))
            {
                if (!*(long long *)v10 || !(v14 = sub_a6d9b4(*(long long *)v10, "crypto/objects/obj_lib.c", 45), *(unsigned long long *)&v9->field_0 = v14, !v14))
                    return v9;
            }
LABEL_a9ae18:
            sub_9c3580(v9);
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/objects/obj_lib.c", 28, "OBJ_dup");
            sub_a36abc(8, 0x8000d, 0);
        }
        return 0;
    }
    else
    {
        return a0;
    }
}
