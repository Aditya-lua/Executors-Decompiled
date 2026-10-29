/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa19fb4..0xa1a12c (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a19fb4_0 {
    char field_0;
    char padding_1[7];
    struct st_a19fb4_1 *field_8;
} st_a19fb4_0;

typedef struct st_a19fb4_1 {
    char field_0;
} st_a19fb4_1;


int sub_a19fb4(unsigned long a0, char a1, st_a19fb4_0 *a2)
{
    char idx;  // x0
    char index;  // x20
    char v4;  // x8
    char v5;  // x8
    char v6;  // x8
    long long *v7;  // x19
    long long v8;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2)
    {
        if (a2->field_8)
        {
            idx = sub_a6bffc(184, "crypto/ec/ec_lib.c", 44);
            if (!idx)
                return *(unsigned int *)&idx;
            *(unsigned long *)(idx + 168) = a0;
            index = idx;
            if (!a1 || (v4 = sub_a6d9b4(a1, "crypto/ec/ec_lib.c", 50), idx = index, *(unsigned long long *)(index + 176) = v4, v4))
            {
                *(st_a19fb4_0 **)idx = a2;
                if (a2->field_0 >> 1 & 1 || !(v5 = sub_9e4958(), idx = index, *(unsigned long long *)(index + 16) = v5, !v5 || (v6 = sub_9e4958(idx), idx = index, *(unsigned long long *)(index + 24) = v6, !v6)))
                {
                    *(unsigned int *)(idx + 36) = 0;
                    *(unsigned int *)(idx + 44) = 4;
                    a2->field_8();
                }
            }
            v7 = (long long *)idx;
            sub_9e48d4(*(long long *)(idx + 16));
            sub_9e48d4(v7[3]);
            sub_a6c2e4(v7[22], "crypto/ec/ec_lib.c", 72);
            sub_a6c2e4(v7, "crypto/ec/ec_lib.c", 73);
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_lib.c", 40, "ossl_ec_group_new_ex");
            v8 = 786689;
LABEL_a1a110:
            sub_a36abc(16, v8, 0);
        }
        return 0;
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ec_lib.c", 36, "ossl_ec_group_new_ex");
    v8 = 108;
    goto LABEL_a1a110;
}
