/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a9514..0x9a95c0 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a9514_3 {
    char padding_0[1264];
    struct st_9a9514_2 *field_4f0;
} st_9a9514_3;

typedef struct st_9a9514_1 {
    struct st_9a9514_0 *field_0;
    unsigned long long field_8;
} st_9a9514_1;

typedef struct st_9a9514_2 {
    char padding_0[256];
    unsigned long long field_100;
} st_9a9514_2;

typedef struct st_9a9514_0 {
    char padding_0[2];
    char field_2;
} st_9a9514_0;


long long sub_9a9514(st_9a9514_3 *a0, st_9a9514_1 *a1)
{
    unsigned long long v2;  // x8
    st_9a9514_0 *v3;  // x9
    st_9a9514_0 *v4;  // x10
    unsigned long n;  // x20
    unsigned long v6;  // x8
    unsigned long v7;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    if (v2 >= 2)
    {
        v3 = a1->field_0;
        v4 = &v3->field_2;
        a1->field_0 = v4;
        a1->field_8 = v2 - 2;
        if (v2 != 2)
        {
            n = v4->padding_0[0];
            v6 = v2 - 3;
            if (n <= v6)
            {
                v7 = v3 + 1;
                a1->field_0 = v7 + n;
                a1->field_8 = v6 - n;
                _memcpy(a0->field_4f0, v7, n);
                a0->field_4f0->field_100 = n;
                return 1;
            }
        }
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/statem_clnt.c", 1369, "dtls_process_hello_verify");
    sub_9a58a4(a0, 50, 159, 0);
    return 0;
}
